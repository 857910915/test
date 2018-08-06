package day11.final1;
/**
 * final  是个修饰符  可以修饰 类、变量、方法。
 * final  如果和其他修饰符一起使用  可以没有先后顺序
 * 例如：
 * 		public final static
 * 		final public static
 * 		static final public
 * */
/**
 * final  修饰的类叫做最终类，不能被继承
 * final  修饰符不能修饰抽象类
 * 			抽象类必须被继承才能使用
 * */
// final修饰的类不能被继承
final class Demo{

}
//抽象类必须被继承才能使用
/*final abstract class Demo1{

}*/
/**
 * 用final修饰的方法叫做最终方法，只能使用，不能重新
 * 如果是静态方法，父类使用final修饰后，子类不能再定义重复的方法
 * final不能修饰抽象方法，抽象方法必须被子类重写
 * */
class Demo2{
	//定义一个方法
	public final void method1() {
		System.out.println("学习");
	}	
	public static void method2() {

	}
	// final不能修饰抽象方法，抽象方法必须被子类重写
	/*	public final static void method3() {

	}*/
}
public class FinalDemo extends Demo2{
	//如果父类的方法用final修饰了，子类不能重新final修饰的方法
	/*	@Override
	public void method1() {
		// TODO 自动生成的方法存根
		super.method1();
		//重新定义方法
		System.out.println("好好学习");
	}*/
	//可以使用final修饰的方法
	/*	public static int method2() {
		return 0;
	}*/
	/**
	 * final 修饰的字段叫做最终量，只能被赋值一次，不能再次改变
	 * final修饰的字段必须附上初始值
	 * */
	//定义一个最终量
	//final修饰基本数据类型
	final static int age=0;
	//final修饰引用数据类型
	final static int[]num=new int[2];
	//final修饰的变量叫做常量 不可改变量
	//声明一个常量 用public final static修饰，变量名全部大写，多个单词之间用——连接	
	public final static int MAX_VALUE=123123;

	public static void main(String[] args) {
		System.out.println(age);
		//final修饰的变量不能再次改变
		//age=1;
		//更改num的是引用还是内容？
		//num=new int[3];//引用数据类型不能更改引用的内存
		num[0]=12;
		num[1]=11;//引用数据类型的内容可以更改，但引用不可以被更改

	}
}




