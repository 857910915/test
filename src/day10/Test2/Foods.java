package day10.Test2;

public class Foods extends Goods{
	@Override
	public void print() {
		// TODO 自动生成的方法存根
		System.out.println("购买食品的账单");
		System.out.println("名字："+this.getName()+"\t价格"+this.getPrice());	
	}
	//构造方法
	public Foods() {
		// TODO 自动生成的构造函数存根
	}
	public  Foods(String name,int price) {
		this.setName(name);
		this.setPrice(price);
	}
}
