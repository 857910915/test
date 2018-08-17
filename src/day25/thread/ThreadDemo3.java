package day25.thread;

public class ThreadDemo3 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			if (i==3) {
				//礼让线程
				Thread.currentThread().yield();
				System.out.println("礼让");
			}
			System.out.println("i=="+i+"  "+Thread.currentThread().getName());			
		}		
	}
	public static void main(String[] args) {
		// 初始化对象
		ThreadDemo3 demo3=new ThreadDemo3();
		//创建线程
		Thread th1=new Thread(demo3,"qq");
		Thread th2=new Thread(demo3,"rr");
		Thread th3=new Thread(demo3,"uu");
		//启动线程
		th1.start();
		th2.start();
		th3.start();
	}

}
