package day08.thisdemo;

public class ThisDemo2 {
	//同类中实例方法间互调(此时可以省略this,但是不建议省略)。
	public void method1() {
		System.out.println("唯我独尊");
		this.method2();//调用方法
	}
	public void method2() {
		System.out.println("葬剑山庄");
		this.method3();
	}
	public void method3() {
		System.out.println("葬剑灬尊");
		//this.method1();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象
		ThisDemo2 demo2=new ThisDemo2();
		demo2.method1();
	}

}
