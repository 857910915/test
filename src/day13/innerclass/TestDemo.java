package day13.innerclass;

import day13.innerclass.OutDemo1.Inner;

public class TestDemo {
	public static void main(String[] args) {
		//使用内部类
		//初始化外部类
		OutDemo1 out=new OutDemo1();
		out.name="浪子一秋";
		//初始化一个内部类
		Inner inner=out.new Inner();
		//给内部类赋值
		inner.name="尊";
		//访问内部类的方法
		inner.printmsg();
		inner.printOutMsg();
		inner.method1();
		//直接初始化一个内部类，但是外部类不能直接访问
		OutDemo1.Inner in=new OutDemo1().new Inner();
		in.printOutMsg();
		
	}
}
