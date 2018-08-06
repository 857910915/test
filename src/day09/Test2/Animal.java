package day09.Test2;

public class Animal {
	private String name;//名字
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//行为
	public void doEat() {
		System.out.println("吃东西");
	}
	//构造方法
	public Animal() {
		// TODO 自动生成的构造函数存根
		System.out.println("父类默认构造方法");
	}
	public  Animal(String name,int age) {
		System.out.println("父类带参数构造方法");
		//给父类属性赋值
		this.name=name;
		this.age=age;
	}
}
