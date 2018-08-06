package day08;
//在同包中不需要import引用
public class TestDemo {
	public static void main(String[]args) {
		//测试默认权限修饰符
		SecondDemo demo=new SecondDemo();
		demo.like="写作";
		demo.toEat();
		//4.初始化一个默认权限修饰的类
		SecondDemo1 demo1=new SecondDemo1();
		System.out.println(demo1.toString());
	}
}
