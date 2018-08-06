package day10.Test3;
//父类
public abstract class Share {
	private int min;
	private double price;
	private double money;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	//构造方法
	public Share() {
		// TODO 自动生成的构造函数存根
	}
	public  Share(int min,int price) {
		this.min=min;
		this.price=price;
	}
	//方法
	public abstract double checkOut() ;
}
