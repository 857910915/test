package day14.stringbuilder;

public class StringBuilderDemo {
	/**
	 * StringBuilder
	 * 		1.可变字符串，内容改变，但引用地址不会改变
	 * 		2.StringBuilder它不是线程安全的，不支持同步，读写速度比较快，一般情况下，不考虑线程安全的情况下，我们尽可能的使用该类
	 * 		3.该类和StringBuffer功能一样，唯一的区别是Stringbuffer线程安全，就是性能比较差
	 * */
	public static void main(String[] args) {
		
		//1.初始化一个StringBuilder对象
		StringBuilder str=new StringBuilder();//空字符序列
		System.out.println("str=="+str);
		
		//2.在尾部追加字符
		str.append(true);//将boolean类型转换成String类型，内容改变，地址不变
		str.append('你');//追加char类型
		str.append(0.8);//追加double类型
		str.append(21);//追加int类型
		str.append(new Object());//追加一个对象
		char[]c={'q','e','m','z','a','。'};//追加一个数组
		str.append(c);
		str.append(c,1,3);//从数组下标开始，长度
		str.append("Hello",0,3);//追加字符序列，开始小标和结束下标，[0,3)
		
		//3.在指定位置插入数据
		str.insert(1, 'a');
		str.insert(3, "World");		
		
		//4.替换  从某个位置开始到某个位置结束，替换指定的字符串
		str.replace(8, 10, "qwe");
		System.out.println("str=="+str);
		
		//5.查询
		String str1=str.substring(12);//从某一位置开始到最后结束
		System.out.println("str1=="+str1);
		str1=str.substring(2,6);//从某处开始到某处结束
		System.out.println("str1=="+str1);
		//查询指定索引位置的元素
		char c1=str.charAt(2);
		System.out.println(c1);
		//查询指定字符首次出现位置
		int index=str.indexOf("dc");
		System.out.println(index);
		//查询指定字符最后一次出现位置
		index=str.lastIndexOf("dc");
		System.out.println(index);
		
		//6.删除指定字符串
		str.delete(0, 3);//[开始，结束）
		System.out.println(str);
		str.deleteCharAt(0);//删除指定索引位置的字符
		System.out.println(str);
		
		//6.反转字符串
		str.reverse();
		System.out.println(str);
	}
}
