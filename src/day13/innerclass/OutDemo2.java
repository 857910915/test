package day13.innerclass;

public class OutDemo2 {
	String name;
	static int number;
	public void method1() {
		System.out.println("外部类实例方法");
		
	}
	public static void method2() {
		System.out.println("外部类静态方法");
	}
	/**
	 * 静态内部类
	 * 		位置：类中，方法外
	 * 		修饰符:只能static abstract  final  public  private  protected  默认
	 * 		成员：静态，非静态
	 * */
	static class Inner1{
		String name;
		static int age;
		public Inner1() {
			// TODO 自动生成的构造函数存根
			System.out.println("内部类默认构造方法");
		}
		public void method1() {
			System.out.println("内部类实例成员");
			//静态内部类实例成员可以访问外部类的静态成员
			number=100;
			name="尊";//代表内部类
			//OutDemo2.this.name="11";//不允许访问外部类的实例成员
		}
		public static void method2() {
			//只能访问外部类的静态成员
			System.out.println("内部类静态成员");
		}
	}
	public static void main(String[] args) {
		//初始化一个静态内部类,没有初始化外部类
		OutDemo2.Inner1 inner1=new OutDemo2.Inner1();
		//访问内部类成员,可以访问使用成员
		inner1.method1();//内部类实例成员
		inner1.method2();//内部类静态成员
		//直接访问内部类的静态成员,通过类名访问
		OutDemo2.Inner1.age=21;
		OutDemo2.Inner1.method2();
		//内部类可以访问外部类的静态成员		
	}
}
