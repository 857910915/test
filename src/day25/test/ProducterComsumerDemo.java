package day25.test;
/**
 * 生产者与消费者模型中，要保证以下几点：
 * 1 同一时间内只能有一个生产者生产     生产方法加锁sychronized
 * 2 同一时间内只能有一个消费者消费     消费方法加锁sychronized
 * 3 共享空间空时消费者不能继续消费     消费前循环判断是否为空，空的话将该线程wait，释放锁允许其他同步方法执行
 * 4 共享空间满时生产者不能继续生产     生产前循环判断是否为满，满的话将该线程wait，释放锁允许其他同步方法执行
 */

/**
 * 生产者: 一直生产,直到生产完10个
 * 在生产过程中,如果库存中存满(1个)则停止生产(由resource控制)
 */
//生产者
class  Producer implements Runnable{
	private  ShareResource  resource;//共享资源对象
	public Producer(ShareResource resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		System.out.println("生产中。。。");
		for (int prodect = 1; prodect <=100; prodect++) {	
			try {
				resource.setProdect(prodect);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
/**
 * 消费者:不断消费,直到消费10个
 *        消费过程中,如果库存有包子则消费,没包子等待(resource中wait())
 */
//消费者
class    Consumer implements Runnable{
	private  ShareResource  resource;//共享资源对象
	public Consumer(ShareResource resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		System.out.println("消费中。。。");
		for (int i = 1; i <= 100; i++) {		
			try {
				resource.getProdect();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
/**
 * 共享资源: 负责控制库存,如果库存没包子了:通知生产者开始生产(notify), 并且通知消费者等待(wait)
 *                  ,如果库存有包子:通知生产者停止生产(wait),   并且通知消费者开始消费(notify)
 *                  notify() / notifyall() :通知 实质上相当于 唤醒
 * 加synchronized 为了保证,同一时刻只有一个生产者在生产,只有一个消费者在消费
 */

//共享资源
class ShareResource{
	private int prodect=-1;
	
	public synchronized void setProdect(int prodect) throws InterruptedException {
		waitIfFull();//如果满,等待   被唤醒后继续执行
		this.prodect=prodect;
		System.out.println("生产包子"+prodect+"个");
		notify();
	}
	public synchronized int getProdect() throws InterruptedException {
		waitIfEmpty();//如果空,等待  被唤醒后继续执行
		int p=this.prodect;
		System.out.println("消费者购买了"+p+"个包子");
		this.prodect=-1;
		notify();
		return p;
	}
	private synchronized void waitIfEmpty() throws InterruptedException {
		if (prodect==-1) {
			System.out.println("消费者等待！");
			wait();
		}
	}
	private synchronized void waitIfFull() throws InterruptedException {
		if (prodect!=-1) {
			System.out.println("生产者等待！");
			wait();
		}
	}
}

public class ProducterComsumerDemo {
	public static void main(String[] args) {
		//初始化对象
		ShareResource resource=new ShareResource();
		//启动线程
		new Thread(new Producer(resource)).start();
		new Thread(new Consumer(resource)).start();
	}
}
