package day12.interface1;
/**
 * 接口：表示一种规范协议
 * 		主要是要类遵循这个规范，实现这个接口
 * 语法：
 * 		修饰符  interface  接口{
 * 			常量
 * 			方法1;
 * 			方法2;
 * 		}
 * 特点：
 * 		1.接口是一个特殊的类，不能直接实例化
 * 		2.接口中不允许有构造方法
 * 		3.接口中的方法都是抽象方法，默认的修饰符是public abstract
 * 		4.接口中只能定义常量，使用public static final 进行修饰
 * 		5.实现接口的类，必须重写当前接口中所有的方法
 * */
public interface FirstInterface {
	//int a; //接口中只能定义常量
/*	public  FirstInterface() {
		接口中不允许有构造方法
	}*/
	//定义方法
	void lock();//上锁
	void unlock();//开锁
}
