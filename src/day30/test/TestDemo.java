package day30.test;
class Base{
	public Base() {
		System.out.println("base");
	}
}


public class TestDemo extends Base{
	public TestDemo() {
		System.out.println("demo");
		//super();
	}
	public static void test(String str) {
		str="World";
	}
	public static void main(String[] args) {
		/*String str="ABCDEFGH";
		//System.out.println(str.subSequence(3, 5));
		String i="";
		if (i==i+0) {
			System.out.println("Hello Java!");
		}*/
		String str="Hello";
		test(str);
		System.out.println(str);
		/*int a=5,b=3;
		if ((a==b)&&(a==1+b++)) {
			
		}
		System.out.println(a+"\t"+b);*/
		str="abcdefgdafoadfjladsf";
		String[]tmp=str.split("f");
		System.out.println(tmp[3]);
		//String c=tmp[4]+"5*10"+5*10;
		//System.out.println(c);
	}

}
