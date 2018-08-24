package day30.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
//通过反射获取构造方法
public class ReflectDemo1 {
	String name;
	int age;
	public ReflectDemo1() {
		// TODO 自动生成的构造函数存根
	}
	private ReflectDemo1(String name) {
		this.name=name;
	}
	ReflectDemo1(int age){
		this.age=age;
	}
	public ReflectDemo1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		System.out.println(this.name+"\t"+this.age);
		return super.toString();
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//	1.获取class对象
		Class myClass=ReflectDemo1.class;
		//反射获取带参数的构造方法
		Constructor<ReflectDemo1>cons=myClass.getConstructor(String.class,int.class);
		//获取构造方法的名称
		System.out.println(cons.getName());
		//获取构造方法参数列表的个数
		System.out.println(cons.getParameterCount());
		//通过构造方法对象创建类的对象
		ReflectDemo1 ref=cons.newInstance("qq",21);
		ref.toString();
		System.out.println("------------------------------------");
		//获取当前类公开的构造方法
		//Constructor<?>[]conss=myClass.getConstructors();
		//获取所有的构造方法
		Constructor<?>[]conss=myClass.getDeclaredConstructors();
		//遍历所有的构造方法对象
		for (Constructor<?> constructor : conss) {
			System.out.println("构造方法名称："+constructor.getName());
			System.out.println("构造方法修饰符："+constructor.getModifiers());
			System.out.println("构造方法参数个数："+constructor.getParameterCount());
			System.out.println("构造方法的类型");
			Parameter[]pars=constructor.getParameters();
			for (Parameter parameter : pars) {
				System.out.println(parameter.getName()+"\t"+parameter.getType());
			}
			System.out.println("-------------------------------------");
		}
	}
}
