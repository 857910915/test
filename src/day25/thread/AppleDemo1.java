package day25.thread;

public class AppleDemo1 implements Runnable{
	private int count=50;
	public synchronized void eatApple() {
		if (count>0) {
			System.out.println(Thread.currentThread().getName()+"吃了第"+count+"个苹果");
			count--;
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			eatApple();		
		}
	}
	public static void main(String[] args) {
		// 初始化对象
		AppleDemo1 demo1=new AppleDemo1();
		//启动线程
		new Thread(demo1, "A").start();
		new Thread(demo1, "B").start();
		new Thread(demo1, "C").start();
	}
}
