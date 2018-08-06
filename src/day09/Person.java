package day09;
/*
 * 父类
 * 		存放子类公共的属性
 * */
public class Person {
	//公共属性
	String name;
	int age;
	private int tel;//电话
	protected String address;
	public  Person() {
		System.out.println("父类默认构造方法");
	}
	public  Person(String name) {
		this();
		System.out.println("父类中带参数的构造方法");
	}
	//方法
	public void sleep() {
		System.out.println(name+"\t\t"+age+"\t\t睡觉");
	}
}
