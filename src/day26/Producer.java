package day26;
//生产者
public class Producer extends Thread{
	private Shop shop;
	public Producer(){}
	public Producer(Shop shop) {
		this.shop=shop;
	}
	//给商店供货
	@Override
	public void run() {
		//线程体
		//持续给商店供货
		while (true) {
			try {
				Thread.sleep(300);
				//给商店发送货物
				this.shop.push();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
