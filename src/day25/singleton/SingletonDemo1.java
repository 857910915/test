package day25.singleton;
//饿汉模式
public class SingletonDemo1 {
	private static final SingletonDemo1 singleton=new SingletonDemo1();
	//构造方法私有化
	private SingletonDemo1(){
		
	}
	//通过类来获取对象，设计一个静态的方法
	public static synchronized SingletonDemo1 getIntance() {
		return singleton;	
	}
}
