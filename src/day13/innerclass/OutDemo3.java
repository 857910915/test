package day13.innerclass;

public class OutDemo3 {
	//属性
	String name;
	int sex;
	public void methord1() {
		System.out.println("外部类的实例方法");
	}
	/**
	 * 局部内部类
	 * 		位置：方法中
	 * 		成员：必须是实例成员
	 * 只能在声明方法中使用
	 * */
	public void method2() {
		int num=10;
		class Inner2{
			String name;
			int age;
			public void method3() {
				//局部内部类可以访问外部类的所有成员
				System.out.println(sex);
				//访问外部类、方法内的局部变量,局部变量必须加上final修饰符，jdk1.8之后不需要加
				System.out.println(num);
				System.out.println("局部内部类的实例方法");
			}
			/*public static void method4() {
				
			}*/			
		}
		//初始化一个内部类对象
		Inner2 in=new Inner2();
		in.name="尊";
		in.age=21;
		in.method3();
	}
	public static void main(String[] args) {
		//初始化一个外部类对象
		OutDemo3 demo3=new OutDemo3();
		demo3.method2();
	}
}
