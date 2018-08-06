package day09.Test1;

public class Dog extends Animal{
	//属性
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//行为
	public void swimming() {
		System.out.println("狗会游泳");
	}
	public Dog() {
		// TODO 自动生成的构造函数存根
	}
	public  Dog(String name,int age) {
		super(name,age);
	}
}
