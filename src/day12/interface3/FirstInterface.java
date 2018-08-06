package day12.interface3;
/*
 * 接口继承语法：
 * 		修饰符 Interface 接口 extends 接口1,接口2....{
 * 		}
 * 特性：
 * 		1.接口可以继承接口
 * 		2.接口可以多继承，只能继承接口中的抽象方法
 * 		3.接口只能继承接口，不能继承类
 * */
interface SecondInterface{
	public void method3();
}
interface ThirdInterface{
	public void method2();
}
interface FourInterface extends SecondInterface,ThirdInterface{
	
}
public interface FirstInterface {
	public void method1() ;
}
