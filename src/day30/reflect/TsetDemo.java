package day30.reflect;

import java.lang.reflect.Field;

public class TsetDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		//获取class对象
		Class<?>myClass=ReflectDemo3.class;
		//反射获取公共字段
		Field field=myClass.getField("msg");//通过字段名称获取一个字段对象
		System.out.println("字段名称："+field.getName());
		//获取所有的成员
		//Field[]fields=myClass.getFields();//获取所有的public成员
		Field[]fields=myClass.getDeclaredFields();//所有成员
		for (Field field2 : fields) {
			System.out.println("--------------------------");
			System.out.println("字段名称："+field2.getName());
			System.out.println("字段的修饰符："+field2.getModifiers());
			System.out.println("字段类型："+field2.getType());
		}
		System.out.println("------------------------------");
		//字段取值或者设置值
		//初始化对象
		Object obj=myClass.newInstance();
		//赋值，找到字段
		Field f1=myClass.getDeclaredField("age");
		f1.setInt(obj, 21);
		f1=myClass.getDeclaredField("msg");
		f1.set(obj, "Hello Java!");			
		f1=myClass.getDeclaredField("name");
		//给私有成员赋值，需要打开权限
		f1.setAccessible(true);
		f1.set(obj, "qas");
		//取值
		System.out.println(f1.get(obj));
		f1=myClass.getDeclaredField("age");
		System.out.println(f1.get(obj));
		//查看
		obj.toString();
	}
}
