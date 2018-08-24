package day30.reflect;
/**
 * 反射机制
 * 		通过类或者对象，可以获取到类的所有结构信息
 * 		（修饰符、构造方法、方法、字段、类名、判断信息）
 * 		通过对象，可以动态设置类的信息，动态执行方法
 * 反射机制是通过运行时类（class）进行操作
 * 每个类只有一个Class对象，Class对象是在类加载的时候就已经存在了，JVM分配的
 * 获取class对象的三种方法
 * 		1.类名.class
 * 		2.对象.getClass();
 * 		3.Class.forName("类的全限定名称");
 * */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// 获取类的class对象
		//第一种
		Class<?> rClass=ReflectDemo.class;
		//第二种
		Class<?> rClass1=new ReflectDemo().getClass();
		//第三种
		Class<?> rClass2=Class.forName("day30.reflect.ReflectDemo");
		System.out.println("rClass=="+rClass);
		System.out.println("rClass1=="+rClass1);
		System.out.println("rClass2=="+rClass2);	
	}
}
