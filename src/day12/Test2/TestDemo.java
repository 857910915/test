package day12.Test2;

public class TestDemo {
	public static void getMoney(ShareInterface face) {
		face.charge();
	}
	public static void main(String[] args) {
		//初始化对象  调用方法
		ShareBicycle bicycle=new ShareBicycle(55,0.6);
		getMoney(bicycle);
		ShareCar car=new ShareCar(40,1,30);
		getMoney(car);
	}
}
