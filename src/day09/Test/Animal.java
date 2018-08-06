package day09.Test;

//父类
public class Animal {
	//属性
	String category;
	String sex;
	String like;
	int age;
	//方法
	public void eat() {
		System.out.println(this.like);
	}
	public Animal() {
		// TODO 自动生成的构造函数存根
		
	}
	public  Animal(String category,String like) {
		this.category=category;
		this.like=like;
		System.out.println(this.category+"喜欢"+this.like);
	}
}
