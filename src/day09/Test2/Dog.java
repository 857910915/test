package day09.Test2;

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
		// TODO 自动生成的构造函
	}
	public  Dog(String name,int age) {
		super(name,age);
	}
	@Override
	public void doEat() {
		// TODO 自动生成的方法存根
		System.out.println("狗喜欢吃肉，汪汪汪");
		//如果保留父类行为  可以使用super调用父类方法
		super.doEat();
	}
}
