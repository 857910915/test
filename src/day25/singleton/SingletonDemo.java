package day25.singleton;
/**
 * 单例设计模式
 * 		当前该类只能有一个对象，这个对象是共享的
 * */
//懒汉模式
public class SingletonDemo {
	String name;
	private static SingletonDemo singleton=null;
	//构造方法私有化
	private SingletonDemo(){

	}
	//通过类来获取对象，设计一个静态的方法
	public static synchronized SingletonDemo getIntance() {
		//创建对象，返回对象
		synchronized (SingletonDemo.class) {
			if (singleton==null) {
				singleton=new SingletonDemo();//初始化一个对象	
			}
		}
		return singleton;//将对象返回到方法调用处
	}
}
