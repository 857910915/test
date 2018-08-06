package day10.Test;

public class Cat extends Pet{
	public Cat() {
		// TODO 自动生成的构造函数存根
	}
	public  Cat(int health) {
		this.setHealth(health);
	}
	@Override
	public void toHospital() {
		// TODO 自动生成的方法存根
		if (this.getHealth()<50) {
			System.out.println("小猫看病,食补");
			this.setHealth(90);
		}
	}
}
