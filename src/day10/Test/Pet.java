package day10.Test;
//父类
/**
 * 1.抽象类与一般类一样 可以拥有属性 方法 构造方法
 * 2.抽象类不能直接实例化，只允许子类继承实例化
 * 3.抽象类可以定义抽象方法，如果一个类中有抽象方法，那么该类必须是抽象类
 * 抽象类在定义的时候必须使用abstract修饰
 * */
public abstract class  Pet {
	//属性
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * 当前方法没有被子类调用  都对该方法进行了重写
	 * 可以使用抽象方法定义  重新定义方法
	 * 抽象方法的特点
	 * 		1.必须使用abstract进行修饰
	 * 		2.不能有方法体
	 * 		3.不能使用private、final、static修饰符
	 * 		4.子类必须重新该方法，如果子类也是抽象类，可以不用重写	
	 * */
	//方法
	public abstract void toHospital() ;
}
