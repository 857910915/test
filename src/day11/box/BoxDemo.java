package day11.box;
/**
 * 包装类：主要作用，将基本数据类型转换为引用数据类型
 * 每个基本数据类型都对应一个包装类类型
 * */
public class BoxDemo {
	public static void main(String[] args) {
		//初始化一个数组 该数组只能存放引用数据类型 object类型
		Object[]arr=new Object[3];
		arr[1]="尊";
		arr[0]=21;
		//装箱 把基本数据类型转换成对应的包装类类型
		//1.手动装箱方法有两种
		//通过构造方法
		Integer i=new Integer(22);//将一个整形转换成integer对象
		//通过静态方法
		Integer i1=Integer.valueOf(21);
		
		//可以将string类型转换成Integer对象
		Integer i2=new Integer("233");
		//通过静态方法
		Integer i3=Integer.valueOf("222");
		//拆箱  把包装类类型转换成基本数据类型
		//手动拆箱
		int  j=i.intValue();
		System.out.println(j);
		//将String开心转换成int类型
		int j1=Integer.parseInt("123");
		System.out.println(j1);
		//自动进行装箱
		Object[]obj={1,3,2,4,6};
		Integer a=10;//编译器进行了自动装箱
		System.out.println(a);
		//自动拆箱
		int b=a;//将引用数据类型赋值给基本数据类型,自动拆箱
		System.out.println(b);
		//进制转换
		//十进制转二进制
		System.out.println(Integer.toBinaryString(4));
		//十进制转16进制
		System.out.println(Integer.toHexString(41));
		//十进制转8进制
		System.out.println(Integer.toOctalString(10));
	}
}
