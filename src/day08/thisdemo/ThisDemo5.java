package day08.thisdemo;

public class ThisDemo5 {
	//构造器重载的互调，this([参数])必须写在构造方法第一行;
	//构造方法重载
	//构造方法只有在对象初始化的时候才会调用一次
	//构造方法重载，构造方法也是每次只能显示直接调用一个
	public  ThisDemo5() {
		System.out.println("默认构造方法");
	}
	public  ThisDemo5(String name) {
		this();
		System.out.println("1个参数的构造方法");
	}
	public  ThisDemo5(String name,int age) {
		this(name);//一个参数
		System.out.println("2个参数的构造方法");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化对象
		//ThisDemo5 demo5=new ThisDemo5();//调用默认的
		//ThisDemo5 demo5=new ThisDemo5("尊");
		ThisDemo5 demo5=new ThisDemo5("尊",21);
	}

}
