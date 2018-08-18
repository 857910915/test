package day26;
//消费者
public class Customer extends Thread{
	private Shop shop;
	public Customer(){}
	public Customer(Shop shop) {
		this.shop=shop;
	}
	//从商店购买
	@Override
	public void run() {		
		// 消费者不停的从商店买东西
		while (true) {
			try {
				Thread.sleep(500);
				this.shop.pop();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
