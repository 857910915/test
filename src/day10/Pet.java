package day10;
//父类
public class Pet {
	//属性
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	//方法
	public void toHospital() {
		System.out.println("去医院看病");
	}
}
