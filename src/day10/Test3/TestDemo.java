package day10.Test3;

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		People p=new People();
		//初始化share对象
		SharedBicycle bicycle=new SharedBicycle(100,0.6);
		Share s1=bicycle;
		p.drive(s1);
		SharedCar car=new SharedCar(120,1,150);
		Share s2=car;
		p.drive(s2);
	}

}
