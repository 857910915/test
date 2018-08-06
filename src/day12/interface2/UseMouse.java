package day12.interface2;
//实现类  鼠标
public class UseMouse implements UsbInterface{
	@Override
	public void loadDrive() {
		// TODO 自动生成的方法存根
		System.out.println("鼠标加载驱动");
	}
	@Override
	public void doWork() {
		// TODO 自动生成的方法存根
		System.out.println("鼠标可以工作了！");
	}
}
