package day08;

/**
 * 访问权限控制符
 * 控制符 			修饰			 	 		范围
 * private			字段、方法		    本类
 * 默认				字段、方法、类		同包
 * protected	字段、方法			同包、不同包
 * public			字段、方法、类		同包、不同包
 * */
public class FirstDemo {
	//属性
	private String name;
	//方法
	private void study(){
		System.out.println(name+"Hello");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FirstDemo demo=new FirstDemo();
		demo.name="尊";
		demo.study();
	}

}
//测试pricate修饰符
class FirstDemo1{
	public void method() {
		FirstDemo demo1=new FirstDemo();
		//demo1.name="安娜";
	}
}
