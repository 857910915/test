package day08.thisdemo;

public class ThisDemo3 {
	//将this作为方法的返回值(链式方法编程);
	public void method1() {
		System.out.println("确认过的眼神");
	}
	//定义一个方法  有返回值
	public ThisDemo3 method2() {
		//处理一个操作
		System.out.println("你不是对的人");
		//将当前对象返回
		return this;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象
		ThisDemo3 demo3=new ThisDemo3();
		System.out.println(demo3);
		//ThisDemo3 demo32=demo3.method2();
		//demo32.method1();
		demo3.method2().method1();//链式语法编程
		//System.out.println();
	}

}
