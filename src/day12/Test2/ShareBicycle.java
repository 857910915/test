package day12.Test2;
//实现类
public class ShareBicycle implements ShareInterface{
	private int min;
	private double price;
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
	public ShareBicycle() {
		// TODO 自动生成的构造函数存根
	}
	public  ShareBicycle(int min,double price) {
		this.setMin(min);
		this.setPrice(price);
	}
	@Override
	public void charge() {
		// 收费标准
		if (min%60==0) {
			double money=this.getMin()/60*this.getPrice();
			System.out.println("骑行时间是"+this.getMin()+"分钟，共计收费"+money+"元");
		}else {
			double money=this.getPrice()*(this.getMin()/60+1);
			System.out.println("骑行时间是"+this.getMin()+"分钟，共计收费"+money+"元");
		}		
	}
}
