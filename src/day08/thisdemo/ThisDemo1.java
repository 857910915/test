package day08.thisdemo;

public class ThisDemo1 {
//解决成员变量和参数(局部变量)之间的二义性,必须使用;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象
		ThisDemo1 demo1=new ThisDemo1();
		demo1.setName("浪子一秋");
		System.out.println(demo1.getName());
	}
}
