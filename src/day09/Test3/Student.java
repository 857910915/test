package day09.Test3;

public class Student {
	//属性
	String name;
	int age;
	//重写toString
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return name+"  "+age;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化student对象
		Student stu=new Student();
		Student stu1=stu;
		System.out.println("stu=="+stu+"\nstu1=="+stu1);
		//判断两个对象是否相等  恒等== 内存引用
		if (stu.equals(stu1)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		//String 类型判断的是内容 其他类引用地址
		String str=new String("123");
		String str1=new String("1234");
		if (str.equals(str1)) {
			System.out.println("内容相等");
		}else {
			System.out.println("内容不相等");
		}
		stu.name="尊";
		stu.age=21;
		String msg=stu.toString();
		System.out.println(msg);
	}
	
}
