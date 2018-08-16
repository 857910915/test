package day24.thread;
/**
 * ThreadDemo1实现Runnable这个接口
 * ThreadDemo1不是线程类
 * */
public class ThreadDemo1 implements Runnable{
	@Override
	public void run() {
		// 线程体
		System.out.println("线程名称："+Thread.currentThread().getName());
	
	}
	public static void main(String[] args) {
		//创建一个ThreadDemo1的实例
		ThreadDemo1 demo=new ThreadDemo1();
		//创建一个线程对象，执行demo对象
		Thread th=new Thread(demo,"qq");
		//启动线程
		th.start();
		//再次启动一个线程
		Thread th1=new Thread(demo,"ww");
		th1.start();
	}
}
