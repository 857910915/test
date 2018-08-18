package day26;
//商店
public class Shop {
	//属性
	private int count=0;//货物的总数
	//进货
	public synchronized void push() throws InterruptedException {
		//数量加1
		if (count==20) {		
			this.wait();//让当前线程等待
		}
		count++;
		System.out.println("当前商店的货物总数是"+count);
		this.notify();
	}
	//销售
	public synchronized void pop() throws InterruptedException {
		//数量减1
		if (count==0) {		
			this.wait();
		}
		count--;
		System.out.println("当前商店的货物剩下"+count);
		this.notify();
	}
}
