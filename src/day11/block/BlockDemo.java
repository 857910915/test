package day11.block;
/**
 * 代码块  可划分为4类
 * 		1.局部代码块
 * 		2.初始化代码块
 * 		3.构造代码块
 * 		4.静态代码块
 * */
public class BlockDemo {
	//局部代码块
	public void method1() {
		System.out.println("方法每调用一次会执行一次");
	}
	public static void method2() {
		System.out.println("方法每调用一次会执行一次");
	}
	//初始化代码块 每创建一个对象的时候，会执行一次
	{
		System.out.println("初始化代码块优先于构造代码块");
	}
	//构造代码块  每创建一个对象的时候，会执行一次
	public BlockDemo() {
		System.out.println("构造代码块");
	}
	//静态代码块  当前类加载到JVM中时  会自动执行一次该代码块  且只会执行一次
	static{
		System.out.println("静态代码块");
	}	
	public static void main(String[] args) {
		//初始化一个BlockDemo对象
		BlockDemo demo=new BlockDemo();
		demo.method1();
		BlockDemo demo1=new BlockDemo();
		
	}
}
