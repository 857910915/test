package day09.Test1;

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
}
