package day25.thread;

import java.util.concurrent.locks.ReentrantLock;

public class AppleLock implements Runnable {
	private int count=50;
	//创建一个互斥锁
	ReentrantLock lock=new ReentrantLock();
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			//上锁
			lock.lock();
			try {
				if (count>0) {
					System.out.println(Thread.currentThread().getName()+"吃了第"+count+"个苹果");
					count--;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				//释放锁
				lock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		// 初始化对象
		AppleLock app=new AppleLock();
		//启动三个线程
		new Thread(app, "A").start();
		new Thread(app, "B").start();
		new Thread(app, "C").start();
	}
}
