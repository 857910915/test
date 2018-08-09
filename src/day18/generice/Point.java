package day18.generice;
/**
 * 泛型类
 * 和类定义的语法一样
 * 修饰符 class 类名[extends 父类 implement 接口] <E,K,W>{
 * 		//使用泛型
 * 		E  变量;
 * }
 * */
//声明一个泛型类
public class Point <T>{
	//属性
	T x;//声明的泛型成员
	T y;
	public static void main(String[] args) {
		/*//1.初始化对象
		Point p=new Point();
		//设置想x，y
		p.x=4;
		p.y=5;
		//初始化对象
		Point p1=new Point();
		p1.x="2.1";
		p1.y="2.3";
		//取值
		int i=(int)p.x;		
		System.out.println(i);*/
		//初始化对象 指定泛型的数据类型（引用数据类型）
		Point<String> p=new Point<String>();
		p.x="11";
		p.y="aa";
		//取值
		System.out.println(p.x+"\t"+p.y);
	}
}
