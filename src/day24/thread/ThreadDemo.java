package day24.thread;
/**
 * ThreadDemo继承了Thread
 * 你什么该类就是一个线程类
 * 必须在子类中重写run方法
 * run方法是线程体
 *  * */
public class ThreadDemo extends Thread{
	@Override
	public void run() {
		// 线程体
		try {
			Thread.sleep(1000);//休眠1s
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//获取线程名称
		System.out.println(Thread.currentThread().getName());
	}
	public static void method() {
		//获取当前线程
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// 1.获取当前线程
		Thread th=Thread.currentThread();
		//2.查看当前线程
		System.out.println("名称："+th.getName());//名称
		System.out.println("状态："+th.getState());//状态
		System.out.println("ID："+th.getId());//ID
		System.out.println("优先级："+th.getPriority());//优先级
		method();
		//3.创建一个子线程，启动了一个线程，其实做了一个异步操作
		ThreadDemo th1=new ThreadDemo();
		//给线程命名
		th1.setName("尊");
		//启动线程  不能直接调用run方法，必须通过start来调用
		th1.start();
		System.out.println("执行完毕！");
	}
}
