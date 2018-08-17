package day25.thread;

public class ThreadDemo2 extends Thread{
	@Override
	public void run() {
		System.out.println("运行状态："+Thread.currentThread().getState()+"\t激活："+Thread.currentThread().isAlive());
	}
	
	public static void main(String[] args) throws InterruptedException {
		//初始化对象
		ThreadDemo2 demo2=new ThreadDemo2();
		System.out.println("创建状态："+demo2.getState()+"\t\t激活："+demo2.isAlive());
		//启动线程
		demo2.start();
		System.out.println("启动状态："+demo2.getState()+"\t激活："+demo2.isAlive());
		demo2.sleep(2000);
		System.out.println("完毕状态："+demo2.getState()+"\t激活："+demo2.isAlive());
	}
}
