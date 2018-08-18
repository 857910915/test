package day26;

public class TestDemo {
	public static void main(String[] args) {
		//创建一个Shop对象
		Shop shop=new Shop();
		//初始化生产者、消费者对象
		Producer pro=new Producer(shop);
		Customer cus=new Customer(shop);
		//启动线程
		pro.start();
		cus.start();
	}
}
