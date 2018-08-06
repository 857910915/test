package day10.Test3;
//子类
public class SharedBicycle extends Share{
	int hour;
	public SharedBicycle() {
		// TODO 自动生成的构造函数存根
	}
	public  SharedBicycle(int min,double price) {
		this.setMin(min);
		this.setPrice(price);
	}
	
	@Override
	public double checkOut() {
		// TODO 自动生成的方法存根
		//时间换算
		if (this.getMin()%60==0) {
			hour=this.getMin()/60;
		}else {
			hour=this.getMin()/60+1;
		}
		//计算费用
		this.setMoney(hour*getPrice());
		return this.getMoney();
	}
}
