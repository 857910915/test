package day25.timer;
/**
 * Created by butter on 16-11-16.
 */


/**
 *
 *        生产者与消费者模型中，要保证以下几点：
 * 1 同一时间内只能有一个生产者生产     生产方法加锁sychronized
 * 2 同一时间内只能有一个消费者消费     消费方法加锁sychronized
 * 3 共享空间空时消费者不能继续消费     消费前循环判断是否为空，空的话将该线程wait，释放锁允许其他同步方法执行
 * 4 共享空间满时生产者不能继续生产     生产前循环判断是否为满，满的话将该线程wait，释放锁允许其他同步方法执行
 *
 */


/**
 * 
 * 生产者: 一直生产,直到生产完10个
 * 在生产过程中,如果库存中存满(1个)则停止生产(由clerk控制)
 * 
 */

class Producer implements Runnable{
	private Clerk clerk;

	public Producer(Clerk clerk) {
		this.clerk = clerk;
	}
	@Override
	public void run() {
		System.out.println("Producer making...");
		for (int product = 1; product <= 1000 ; product++) {
			try {
				clerk.setProdect(product);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 消费者:不断消费,直到消费10个
 *        消费过程中,如果库存有货则消费,没货等待(clerk中wait())
 */

class Consumer implements Runnable{
	private Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("Consumer buying...");
		for (int i = 1; i <= 1000; i++) {
			try {
				clerk.getProdect();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 售货员: 负责控制库存,如果库存没货:通知生产者开始生产(notify), 并且通知消费者等待(wait)
 *                  ,如果库存有货:通知生产者停止生产(wait),   并且通知消费者开始消费(notify)
 *                  notify() / notifyall() :通知 实质上相当于 唤醒
 * 加synchronized 为了保证,同一时刻只有一个生产者在生产,只有一个消费者在消费
 * 
 */

class Clerk{
	private int product = -1;

	public synchronized void setProdect(int product) throws InterruptedException {
		waitIfFull(); //如果满,等待   被唤醒后继续执行
		this.product = product;
		System.out.println("producer make :" + product);
		notify();
	}
	public synchronized int getProdect() throws InterruptedException {
		waitIfEmpty(); //如果空,等待  被唤醒后继续执行
		int p = this.product;
		System.out.println("Consumer get :" + p);
		this.product = -1;
		notify();
		return p;
	}

	private synchronized void waitIfEmpty() throws InterruptedException {
		if(product == -1){
			System.out.println("~~~~~~~consumer wait");
			wait();
		}
	}
	private synchronized void waitIfFull() throws InterruptedException {
		if(product != -1){
			System.out.println("~~~~~~~producer wait");
			wait();
		}
	}

}

/**
 * 主类
 */
public class Demo_ProducerComsumer {

	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		new Thread(new Producer(clerk)).start();
		new Thread(new Consumer(clerk)).start();
	}
}