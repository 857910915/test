package day10.Test3;

public class SharedCar extends Share{
	//属性
	private int distance;
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	//构造方法
	public SharedCar() {
		// TODO 自动生成的构造函数存根
	}
	public  SharedCar(int min,int price,int distance) {
		this.setMin(min);
		this.setPrice(price);
		this.setDistance(distance);
	}
	@Override
	public double checkOut() {
		// TODO 自动生成的方法存根
		if (this.getMin()%10==0) {
			this.setMin(getMin()/10);
		}else {
			this.setMin(getMin()/10+1);
		}
		//计算经济
		if (distance<=10) {
			this.setMoney(getMin()*this.getPrice());
		}else {
			this.setMoney(getMin()*this.getPrice()+(distance-10)*1);
		}
		return this.getMoney();
	}
}
