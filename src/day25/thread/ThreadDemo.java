package day25.thread;

public class ThreadDemo extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 120; i++) {
			System.out.println(Thread.currentThread().getName()+"\t优先级："+Thread.currentThread().getPriority());
			
		}
	}
	
	public static void main(String[] args) {
		//初始三个线程
		ThreadDemo demo=new ThreadDemo();
		ThreadDemo demo1=new ThreadDemo();
		ThreadDemo demo2=new ThreadDemo();
		//命名
		demo.setName("A");
		demo1.setName("B");
		demo2.setName("C");
		//设置优先级1-5  默认是5
		demo.setPriority(MIN_PRIORITY);
		demo1.setPriority(MAX_PRIORITY);
		
		//启动
		demo.start();
		demo1.start();
		demo2.start();
	}
}
