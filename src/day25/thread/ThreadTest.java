package day25.thread;

public class ThreadTest extends Thread{
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <=100; i++) {
				if (i%2==0) {
					System.out.print(i+"  ");
				}
			}
		}
	}

	public static void main(String[] args) {
		//创建对象
		ThreadTest test=new ThreadTest();
		test.start();
	}
}
