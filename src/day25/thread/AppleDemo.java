package day25.thread;

public class AppleDemo implements Runnable {
	//苹果数量
	private int count=50;
	private static Object obj=new Object();
	/**
	 * synchronized修饰符
	 * 		可以修饰方法，锁住的是当前对象this
	 * 		可以修饰代码块
	 * 		同步的意思
	 * */
	//修饰方法修饰的是this对象
	public synchronized void method(){
		if (count>0) {
				System.out.println(Thread.currentThread().getName()+"1吃了第"+count+"个苹果");
				count--;
			}
	}
	public void method1() {
		synchronized (obj) {//同步代码块,作用域精确
			if (count>0) {
				System.out.println(Thread.currentThread().getName()+"2吃了第"+count+"个苹果");
				count--;
			}
		}
	}
	@Override
	public void run() {
		// 吃苹果
		for (int i = 0; i < 50; i++) {
			//method();
			method1();
		}
	}

	public static void main(String[] args) {
		// 初始化对象
		AppleDemo demo=new AppleDemo();
		//创建线程，启动线程
		Thread th1=new Thread(demo,"A");
		th1.start();
		Thread th2=new Thread(demo,"B");
		th2.start();
		Thread th3=new Thread(demo,"C");			
		th3.start();

	}

}
