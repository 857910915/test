package day08.thisdemo;

public class ThisDemo4 {
	//将this作为参数传递给另一个方法;
	//属性
	private String name;
	static class Operation{
		//接收一个对象  给对象的的name赋值
		public static void setValues(ThisDemo4 demo4) {
			demo4.setName("安娜");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void method1() {
		//获取this  将this作为参数 传递给另一个方法
		Operation.setValues(this);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象
		ThisDemo4 demo4=new ThisDemo4();
		demo4.method1();
		System.out.println(demo4.getName());
	}

}
