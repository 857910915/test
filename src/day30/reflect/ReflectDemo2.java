package day30.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

//通过反射获取类的所有方法
public class ReflectDemo2 {

	public void meithod1() {
		System.out.println("公共无参数方法");
	}public static void method2() {
		System.out.println("静态公共无参数方法");
	}public void method3(String name) {
		System.out.println("name:"+name);
	}protected String value() {
		return "Hello";
	}void method3(int age,String name){
		System.out.println(name+"\t"+age);
	}private void method4() {
		System.out.println("4");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 获取类的class对象
		Class<?> myClass=ReflectDemo2.class;
		//通过反射获取class的公共方法
		/**
		 * name:方法名
		 * type：参数类型
		 * */
		Method mt=myClass.getMethod("method3", String.class);
		System.out.println("方法的描述："+mt.toGenericString());
		//调用方法
		Object obj=myClass.newInstance();//默认的构造方法，创建对象
		mt.invoke(obj, "qwe");
		//获取当前类的所有方法
		//Method[]methods=myClass.getMethods();//获取所有公开的包括继承父类的
		Method[]methods=myClass.getDeclaredMethods();//获取当前类所有的方法
		for (Method method : methods) {
			System.out.println("----------------------");
			System.out.println("方法名称："+method.getName());
			System.out.println("方法参数个数："+method.getParameterCount());
			System.out.println("方法的修饰符："+method.getModifiers());
			System.out.println("方法的返回值class："+method.getReturnType());
			System.out.println("方法的抛出异常类型：");
			Class<?>[]arr=method.getExceptionTypes();
			for (Class<?> class1 : arr) {
				System.out.println("\t"+class1.getSimpleName());
			}System.out.println("方法的参数列表：");
			Parameter[]pars=method.getParameters();
			for (Parameter parameter : pars) {
				System.out.println(parameter.getName()+"\t"+parameter.getType());
			}
		}		
	}
}
