package day12.interface1;
//实现类
public class AntiTheftDoor1 extends Door implements FirstInterface,SecondInterface{
	@Override
	public void lock() {
		// TODO 自动生成的方法存根
		System.out.println("通过指纹上锁");
	}
	@Override
	public void unlock() {
		// TODO 自动生成的方法存根
		System.out.println("通过指纹解锁");
	}
	@Override
	public void firePrevention() {
		// TODO 自动生成的方法存根
		System.out.println("喷泡沫、干粉，可以自动报警！");
	}
}
