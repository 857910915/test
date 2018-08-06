package day14.string;

public class StringDemo {

	public static void main(String[] args) {
		//1.创建字符串的两种方式
		String str="ABCD";//字面量
		//2.通过构造方法创建一个对象//堆中分配的内存
		String str1=new String("ABCD");
		//3.
		String str2="ABC";
		//4.合并字符串，堆中分配的内存
		String str3=str2+"D";
		//5.合并字符串
		String str4="AB"+"CD";
		//String主要分配内存的地方有两个  1.堆区  2.常量池
		//常量池  存储的是常量，虚拟机在编译的时候就已经将这些数据存储在常量池中
		//堆区：new String的引用，拼接的新字符串
		//字符串进行比较的时候 ==比较的是引用地址
		if (str==str4) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		//equals比较的是字面量是否相等，不比内存
		if (str1.equals(str3)) {
			System.out.println("字面量相等");
		}else {
			System.out.println("字面量不相等");
		}
		//判断一个字符是否等于常量，要用常量和对象比较
		String str5=null;
		if ("123".equals(str5)) {
			System.out.println("相等");
		}
		//判断地址是否为空
		if (str5==null) {
			System.out.println("地址为空");
		}
		//判断内容是否为空
		if ("".equals(str5)) {
			System.out.println("内容为空");
		}
		System.out.println(str);
	}
}
