package day08.setinit;

public class User {
	//属性 
	private String name;
	private int age;
	//赋值 取值
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//默认构造方法
	public User() {
		
	}
	public User(String name,int age) {
		//通过this 解决成员变量和局部变量的二义性
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象  赋值  两种方式
		//1. 通过setter注入
		User user=new User();
		user.setName("浪子一秋");
		user.setAge(21);
		System.out.println("name=="+user.getName()+"\nage=="+user.getAge());
		//2.通过构造方法直接调用带参数的构造器,创建出来的对象,就有了初始值.
		User user1=new User("尊",20);
		System.out.println("name=="+user1.getName()+"\nage=="+user1.getAge());
		/**
		 *总结：
		 *			 初始化对象的时候，对象的属性比较少的情况下，我们通过构造方法给对象的属性进行赋值
		 *			 如果对象的属性比较多的情况下，最好通过setter注入的方式进行赋值
		 */
	}

}
