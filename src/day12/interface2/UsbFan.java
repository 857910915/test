package day12.interface2;
//实现类  风扇
public class UsbFan implements UsbInterface{
	@Override
	public void loadDrive() {
		// TODO 自动生成的方法存根
		System.out.println("风扇加载驱动");
	}
	@Override
	public void doWork() {
		// TODO 自动生成的方法存根
		System.out.println("吹风");
	}
}
