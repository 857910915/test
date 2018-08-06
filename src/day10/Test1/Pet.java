package day10.Test1;
//将父类作为形参
public abstract class Pet {
	//属性
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	//构造方法
	public Pet() {
		// TODO 自动生成的构造函数存根
	}
	public  Pet(int health) {
		this.health=health;
	}
	//抽象方法
	//喂食
	public abstract void eatFoods();
}
