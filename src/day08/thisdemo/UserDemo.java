package day08.thisdemo;

public class UserDemo {
	/*
	 * this 表示当前对象.
	 * this主要存在于1个位置:方法中
     * 构造方法中:  就表示当前创建的对象.
     * 实例方法中:  哪一个对象调用this所在的方法,那么此时this就表示哪一个对象.
	 * 当一个对象创建之后,JVM会分配一个引用自身的引用:this.
	 */
	/*
	 * 使用this:
	 * ①　解决成员变量和参数(局部变量)之间的二义性,必须使用;
	 * ②　同类中实例方法间互调(此时可以省略this,但是不建议省略)。
	 * ③　将this作为参数传递给另一个方法;
	 * ④　将this作为方法的返回值(链式方法编程);
	 * ⑤　构造器重载的互调，this([参数])必须写在构造方法第一行;
	 * ⑥　static不能和this一起使用;
	 * 				 当字节码被加载进JVM,static成员以及存在了.
	 *				 但是此时对象还没有创建,没有对象,就没有this.	            
	 */
	//属性 
	String name;
	int age;
	//方法
	public void method() {
		System.out.println("this==="+this);
		//this.name="一叶知秋";
		System.out.println(name+"  "+age);
	}
	public static void method1() {
		//this.name="name";
	}
	//默认构造方法
	public  UserDemo() {
		this.name="剑侠情缘";
	}
	//入口方法
	public static void main(String[]args) {
		UserDemo.method1();
		//初始化对象
		UserDemo user=new UserDemo();
		//user.name="尊";
		user.age=21;
		user.method();
		System.out.println("user==="+user);
		//初始化对象
		UserDemo user1=new UserDemo();
		user1.name="安娜";
		user1.age=18;
		user1.method();
		System.out.println("user1==="+user1);
	}
}
