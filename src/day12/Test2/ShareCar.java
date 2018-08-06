package day12.Test2;
//共享小汽车
public class ShareCar implements ShareInterface{
	private int min;
	private double price;
	private int distance;
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
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public ShareCar() {
		// TODO 自动生成的构造函数存根
	}
	public  ShareCar(int min,double price,int distance) {
		this.setMin(min);
		this.setPrice(price);
		this.setDistance(distance);
	}
	@Override
	public void charge() {
		// 收费标准
		if (this.getMin()%10==0) {
			if (this.getDistance()<=10) {
				double money=this.getMin()/10*this.getPrice();
				System.out.println("骑行时间是"+this.getMin()+"分钟，共计收费"+money+"元");				System.out.println("驾驶时间是"+this.getMin()+"分钟，共计收费"+money+"元");
			}else {
				double money=this.getMin()/10*this.getPrice()+this.getDistance()-10;
				System.out.println("骑行时间是"+this.getMin()+"分钟，行驶的路程是"+this.getDistance()+"公里，共计收费"+money+"元");
			}
		}else {
			if (this.getDistance()<=10) {
				double money=this.getMin()/10*this.getPrice();
				System.out.println("骑行时间是"+this.getMin()+"分钟，共计收费"+money+"元");				System.out.println("驾驶时间是"+this.getMin()+"分钟，共计收费"+money+"元");
			}else {
				double money=this.getMin()/10*this.getPrice()+this.getDistance()-10;
				System.out.println("骑行时间是"+this.getMin()+"分钟，行驶的路程是"+this.getDistance()+"公里，共计收费"+money+"元");
			}
		}
		
	}
}
