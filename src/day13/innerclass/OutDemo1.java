package day13.innerclass;
/**
 * @author 浪子一秋
 * 
 * 内部类：在类的内部定义一个类，可以看做类的成员
 * 类的成员：字段、方法、类   
 * 内部类类型：
 * 		1.实例内部类
 * 		2.静态内部类
 * 		3.局部内部类
 * 		4.匿名内部类
 * */
public class OutDemo1 {
	//外部类的属性
	String name;
	int age;
	//外部类的方法
	public void method1() {
		System.out.println("外部类");
	}
	//定义一个实例内部类
	/**
	 * 实例内部类
	 * 		位置：类中，方法外
	 * 		修饰符：public、private、protected、默认
	 * 		不能有：static
	 * 		类中定义的成员
	 * 				不能使用static进行修饰
	 * 				访问权限修饰符：都可以
	 * 		内部类访问外部类的成员
	 * 			在内部类中可以直接访问外部类的成员（实例和静态）
	 * */
	class Inner{
		//定义内部成员
		String name;
		//static int  num;//不能使用static进行修饰
		public void printmsg() {
			System.out.println("实例类的内部方法:"+name);
		}
		public void printOutMsg() {
			//如果外部类成员和内部类成员一致，默认访问的是内部类成员
			//如果是访问外部类成员
			System.out.println(OutDemo1.this.name);
			//调用外部类的method1方法
			OutDemo1.this.method1();
			//通过内部类给外部类成员赋值
			OutDemo1.this.age=21;
		}
		public void method1() {
			System.out.println("内部类");
		}
		//构造方法
		public Inner() {
			// TODO 自动生成的构造函数存根
			System.out.println("内部类默认构造方法");
		}
		
	}
	
}
