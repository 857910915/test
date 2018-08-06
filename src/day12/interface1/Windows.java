package day12.interface1;
/**
 * 
 * */
public class Windows implements ThirdInterface,FirstInterface{
	@Override
	public void guardWang() {
		// TODO 自动生成的方法存根
		System.out.println("此处有监控，实时监控！");
	}
	@Override
	public void lock() {
		// TODO 自动生成的方法存根
		System.out.println("窗户关闭");
	}
	@Override
	public void unlock() {
		// TODO 自动生成的方法存根
		System.out.println("窗户打开");
	}
}
