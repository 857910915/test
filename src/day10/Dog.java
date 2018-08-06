package day10;

public class Dog extends Pet{
	//构造方法
	public Dog() {
		// TODO 自动生成的构造函数存根
	}
	public  Dog(int health) {
		this.setHealth(health);
	}
	//重写父类方法
	@Override
	public void toHospital() {
		// TODO 自动生成的方法存根
		if (this.getHealth()<60) {
			System.out.println("给狗狗打针吃药");
			//恢复健康值
			this.setHealth(90);
		}
	}
}
