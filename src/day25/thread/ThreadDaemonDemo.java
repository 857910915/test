package day25.thread;

public class ThreadDaemonDemo extends Thread{
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("七夕节快乐");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//创建对象
		ThreadDaemonDemo demo=new ThreadDaemonDemo();
		//把当前线程设为守护线程，需要在启动之前设置
		demo.setDaemon(true);
		//启动线程
		demo.start();		
		System.out.println("不快乐！");
		Thread.sleep(3000);
		System.out.println("喝酒");
	}
}