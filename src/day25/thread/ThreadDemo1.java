package day25.thread;

public class ThreadDemo1 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("生日快乐");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("七夕快乐！");
	}

	public static void main(String[] args) throws InterruptedException {
		// 初始化对象
		ThreadDemo1 demo1=new ThreadDemo1();

		//启动线程
		demo1.start();
		//合并线程，demo1和主线程合并
		//demo1.join();//join在start之后使用
		//主线程执行方法
		for (int i = 0; i < 10; i++) {
			Thread.sleep(200);
			if (i==3) {
				demo1.join();
			}
			System.out.println("i====="+i);
		}
	}
}
