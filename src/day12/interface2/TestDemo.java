package day12.interface2;

public class TestDemo {
	//加载驱动
	public static void load(UsbInterface face) {
		face.loadDrive();
		face.doWork();		
	}
	public static void main(String[] args) {
		// 初始化对象  调用方法
		UsbFan fan=new UsbFan();
		load(fan);
		UsbDrive drive=new UsbDrive();
		load(drive);
		UseMouse mouse=new UseMouse();
		load(mouse);
	}

}
