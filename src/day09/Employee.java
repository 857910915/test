package day09;

/**
 * 子类
 * super 可以访问父类的属性和方法
 * super 只能存在在子类的方法中
 * super 可以存在子类的构造方法中 用来调用父类的构造方法 必须放在构造方法的第一行Super();
 * */
public class Employee extends Person{
	//属性
	String hirDete;//入职时间
	//子类中定义和父类相同的属性和方法
	String name;
	public void sleep() {
		System.out.println("不能睡了");
	}
	//子类的构造方法
	/**
	 * 初始化一个对象的时候 ，构造方法必须调用一次
	 * 		1.如果子类的构造方法没有显示调用父类的构造方法，会默认执行默认的构造方法
	 * 		2.如果显示（super）调用父类指定的构造方法，父类指定的构造方法会被执行一次
	 * */
	public  Employee() {
		//显示调用父类构造方法
		//super();//指定调用默认的构造方法
		super("尊");//指定调用带参数的构造方法
		System.out.println("子类默认的构造方法");
	}
	public  Employee(String name) {
		System.out.println("子类有参构造方法");
	}
	//行为
	public void method1() {
		//不使用super可以访问父类的成员
		//子类和父类没有相同的属性和方法
		System.out.println("name=="+this.name);//调用当前类
		System.out.println("super name=="+super.name);//调用父类
		super.sleep();
		this.sleep();
	}
}
