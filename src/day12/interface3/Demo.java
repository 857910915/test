package day12.interface3;

public class Demo implements FirstInterface,SecondInterface,ThirdInterface{
	@Override
	public void method1() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void method2() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void method3() {
		// TODO 自动生成的方法存根
		
	}
}
//Demo1实现FourInterface
class Demo1 implements FourInterface{
	@Override
	public void method2() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void method3() {
		// TODO 自动生成的方法存根
		
	}
}
/**
 * 抽象类实现一个接口后，可以不对接口中的方法进行重写。抽象类中可以包含抽象方法
 * 如果一个类继承了这个抽象类，必须对接口方法进行重写
 * */
abstract class Demo2 implements FourInterface{}
