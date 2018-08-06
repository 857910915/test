package day10.Test2;
//子类
public class TVs extends Goods{
	@Override
	public void print() {
		// TODO 自动生成的方法存根			
		System.out.println("购买电视的账单");
		System.out.println("名字："+this.getName()+"\t价格"+this.getPrice());	
	}
	//构造方法
	public TVs() {
		// TODO 自动生成的构造函数存根
	}
	public  TVs(String name,int price) {
		this.setName(name);
		this.setPrice(price);
	}

}
