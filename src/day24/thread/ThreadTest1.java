package day24.thread;

public class ThreadTest1 extends Thread{
	// 苹果总数
	static int count=50;
	@Override
	public void run() {
		// 吃苹果
		for (int i = 50; i >0; i--) {
			if (count>0) {
				System.out.println(Thread.currentThread().getName()+"吃了第"+(count--)+"苹果");
			}		
		}
	}
	public static void main(String[] args) {
		//创建三个线程
		ThreadTest1 th1=new ThreadTest1();
		th1.setName("A");
		ThreadTest1 th2=new ThreadTest1();
		th2.setName("B");
		ThreadTest1 th3=new ThreadTest1();
		th3.setName("B");
		th1.start();
		th2.start();
		th3.start();
	}
}
