package day12.interface1;
//子类
/**
 * 防盗门
 * 		具有门的特点
 * 		有锁的功能
 * */
/**
 * 实现类：实现某个接口的类
 * 语法：  修饰符  class extends 父类  implements  接口1,接口2...{
 * 					必须重写接口中所有方法
 * 				}
 * */
public class AntiTheftDoor extends Door implements FirstInterface,SecondInterface,ThirdInterface{
	@Override
	public void lock() {
		// TODO 自动生成的方法存根
		System.out.println("通过钥匙上锁");
	}
	@Override
	public void unlock() {
		// TODO 自动生成的方法存根
		System.out.println("通过钥匙解锁");
	}
	@Override
	public void firePrevention() {
		// TODO 自动生成的方法存根
		System.out.println("喷水防烟雾");
	}
	@Override
	public void guardWang() {
		// TODO 自动生成的方法存根
		System.out.println("提醒主人，小心绿帽子");
	}
}
