package day24.thread;
//死锁
public class DeadLockDemo implements Runnable{
	//全局变量
	boolean isFlag;
	Object obj=new Object();
	Object obj1=new Object();
	//一个线程执行A
	public void methodA() {
		System.out.println("methodA=="+Thread.currentThread().getName());
		synchronized (obj) {
			System.out.println("obj已经加锁");
			synchronized (obj1) {
				System.out.println("访问obj1");
			}
			System.out.println("obj1访问结束");
		}
		System.out.println("obj已经解锁");
	}
	
	//一个线程执行B
		public void methodB() {
			System.out.println("methodB=="+Thread.currentThread().getName());
			synchronized (obj1) {
				System.out.println("----->obj1已经加锁");
				synchronized (obj) {
					System.out.println("------>访问obj");
				}
				System.out.println("------>obj访问结束");
			}
			System.out.println("------>obj1解锁");
		}
	
	@Override
		public void run() {
			if (!isFlag) {
				isFlag=!isFlag;
				methodA();
			}else {
				methodB();
			}
			
		}
	
	public static void main(String[] args) {
		// 创建对象
		DeadLockDemo demo=new DeadLockDemo();
		
		//启动两个线程
		new Thread(demo, "A").start();
		new Thread(demo, "B").start();
		

	}
}
