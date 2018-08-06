package day13.innerclass;
//声明一个接口
interface MyInterface{
	public void sendMsg(String msg);
}
public class OutDemo4 {
	public static void method3(MyInterface face) {
		face.sendMsg("你好啊");
	}
	/**
	 * 匿名内部类：当前这个类是没有名字的
	 * 定义的位置：方法内
	 * */
	public static void main(String[] args) {
		//定义了一个匿名的类，类的名字不知道，这个类肯定实现了接口
		MyInterface face=new MyInterface() {
			//属性
			
			//方法
			void method2(){
				System.out.println("Hello");
			}
			@Override
			public void sendMsg(String msg) {
				// TODO 自动生成的方法存根
				System.out.println(msg);
			}
		};
		//多态
		method3(face);
	}
}
