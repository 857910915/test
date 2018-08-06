package day12.interface2;
//实现类  U盘
public class UsbDrive implements UsbInterface{
	@Override
	public void loadDrive() {
		// TODO 自动生成的方法存根
		System.out.println("U盘加载驱动");
	}
	@Override
	public void doWork() {
		// TODO 自动生成的方法存根
		System.out.println("存储等功能");
	}
}
