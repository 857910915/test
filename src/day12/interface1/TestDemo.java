package day12.interface1;
//测试类
public class TestDemo {
	//实现调用FirstInterface方法
	public static void method1(FirstInterface face) {
		face.lock();
		face.unlock();
	}
	//实现SecondInterface
	public static void method2(SecondInterface face) {
		face.firePrevention();
	}
	public static void method3(ThirdInterface face) {
		face.guardWang();
	}
	public static void main(String[] args) {
		/*// 初始化一个安全门
		AntiTheftDoor door=new AntiTheftDoor();
		//调用方法
		door.openDoor();
		door.closeDoor();
		door.lock();
		door.unlock();
		door.firePrevention();
		door.guardWang();
		//初始化另一个安全门
		AntiTheftDoor1 door1=new AntiTheftDoor1();
		door1.openDoor();
		door1.closeDoor();
		door1.lock();
		door1.unlock();
		door1.firePrevention();
		//初始化一个窗户
		Windows win=new Windows();
		win.guardWang();*/
		/*
		 * 以多态的方法初始化一个对象
		 * */
		//初始化一个对象，将对象赋值给父类类型
		/*FirstInterface face1=new AntiTheftDoor();//接口可以看成一个特殊的父类
		//调用方法
		face1.lock();
		face1.unlock();
		Door door=(Door)face1;
		door.openDoor();
		door.closeDoor();*/
		//初始化一个防盗门
		AntiTheftDoor face1=new AntiTheftDoor();
		//调用开锁、关锁
		method1(face1);
		method2(face1);
		method3(face1);
		//初始化一个窗户
		Windows win=new Windows();
		method3(win);
		method1(win);
	}

}
