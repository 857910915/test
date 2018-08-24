package day10.Test2;
//父类
public abstract class Goods{
	//属性
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//构造方法
	public Goods() {
		// TODO 自动生成的构造函数存根
	}
	public  Goods(String name,int price) {
		this.name=name;
		this.price=price;
	}
	//打印功能
	public abstract void print();
}
