package day10;

public class Penguin extends Pet{
	//构造方法
	public Penguin() {
		// TODO 自动生成的构造函数存根
	}
	public  Penguin(int health) {
		this.setHealth(health);
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
