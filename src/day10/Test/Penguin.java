package day10.Test;

public class Penguin extends Pet{
	//构造方法
	public Penguin() {
		// TODO 自动生成的构造函数存根
	}
	public  Penguin(int health) {
		this.setHealth(health);
	}
	//子类特有行为
	public void swimming() {
		System.out.println("企鹅在南极游泳");
	}
	@Override
	public void toHospital() {
		// TODO 自动生成的方法存根
		if (this.getHealth()<50) {
			System.out.println("给企鹅食疗");
			this.setHealth(90);
		}
	}
}
