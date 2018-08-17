package day24.thread;
//存在50个苹果,现在有请三个童鞋(小A,小B,小C)上台表演吃苹果.
public class ThreadTest implements Runnable{
	int count=50;
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
		// 初始化对象
		ThreadTest test=new ThreadTest();
		//创建线程，启动线程
		Thread th1=new Thread(test,"A");
		th1.start();
		Thread th2=new Thread(test,"B");
		th2.start();
		Thread th3=new Thread(test,"C");			
		th3.start();
	}

}
