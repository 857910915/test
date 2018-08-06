package day09.Test2;

public class Cat extends Animal{
	//设置子类特有属性
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	//特有行为
	public void upperTree() {
		System.out.println("猫可以上树");
	}
	public Cat() {
		// TODO 自动生成的构造函数存根
		System.out.println("猫的默认构造方法");
	}
	public  Cat(String name,int age) {
		//调用父类带参数的构造方法  直接给父类属性赋值
		super(name,age);
	}
	/**
	 * 重写 只能是方法 只能重写父类的方法
	 * 当父类的功能满足不了子类特性， 子类需要对父类的方法重新定义
	 * 1.必须在子类中重写
	 * 2.方法名 参数列表必须一致
	 * 3.修饰符要嘛和父类一致，要嘛比父类修饰符权限大
	 * 4.子类方法的返回值类型是和父类方法的返回类型相同或者是其子类。
	 * 5.方法中声明的异常要么一致  要么获取子类类型
	 * */
	@Override		//注解
	public void doEat() {//重写父类方法
		// TODO 自动生成的方法存根
		//super.doEat();//调用父类的方法
		System.out.println("猫吃鱼，喵喵喵");
	}
}
