package day08.test;

import day08.SecondDemo;
import day08.ThirdDemo;
public class TestDemo {
	/**
	 * 不同包测试不同的类
	 * */
	public static void main(String[]args) {
		//1.初始化SecondDemo类
		SecondDemo demo=new SecondDemo();
		//2.访问demo属性
		//demo.name="";//private 只能在同类中访问
		//demo.like="";//默认 只能在同包使用
		//demo.toEat();//默认 只能在同包使用
		//3.初始化一个默认修饰符的类
		//SecondDemo1 demo1=new SecondDemo1();
		//在不同包中访问public 修饰的成员和类
		ThirdDemo third=new ThirdDemo();
		third.name="浪子一秋";
		third.age=21;
		third.printFormat();
	}
}
