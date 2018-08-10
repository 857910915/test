package day17.data;

public class Student {
	//属性
	private String name;
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
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	public  Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
