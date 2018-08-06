package day14.string;

import java.io.UnsupportedEncodingException;

import javax.naming.ldap.StartTlsRequest;

public class StringDemo1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//通过构造方法创建一个字符串
		String str=new String();
		System.out.println(str.isEmpty());//判断一个字符串是不是空“”
		System.out.println(str.length());//获取字符串的长度
		
		byte[]b={1,2,4,6};//将byte数组转成一个字符串
		System.out.println(str);
		
		str=new String(b,"gbk");//指定编码格式
		System.out.println(str);
		char[]c={'a','d','g','c','e'};
		
		str=new String(c,1,3);//将数组c从下标1开始，截取长度为3，转成字符串
		System.out.println(str);
		
		char cr=str.charAt(0);//获取指定元素的char字符
		System.out.println(cr);
		
		//返回一个负数表示字符串小于另一个字符串，等于0表示相等，正数表示大于
		int result=str.compareTo("ad");//比较字符串
		result=str.compareToIgnoreCase("Hbb");//忽略大小写
		System.out.println(result);
		
		//判断字符串是否包含某个字符串
		System.out.println(str.contains("d"));
		System.out.println(str.equalsIgnoreCase("Dg"));//比较字符串，不区分大小写
		System.out.println(str.equals("Dg"));//比较字符串，区分大小写
		
		//静态方法将char数组转换成string
		str=String.copyValueOf(c);
		System.out.println(str);
		
		//判断字符串已e结尾
		System.out.println(str.endsWith("e"));
		//已某个字符为前缀
		System.out.println(str.startsWith("a"));
		
		//字符串查询indexof()查询字符在字符串中第一次出现的索引
		System.out.println(str.indexOf('g'));
		System.out.println(str.indexOf("dg"));//字符串首次出现的位置
		//最后一次出现的位置
		System.out.println(str.lastIndexOf('g'));
		System.out.println(str.lastIndexOf("ce"));
		
		//字符串大小写转换，生成新的字符串
		System.out.println(str.toUpperCase());//转大写
		System.out.println(str.toLowerCase());
		
		//截取字符串
		System.out.println(str.substring(3));//从3到结尾
		System.out.println(str.substring(2, 4));//[2,4)
		
		//分割字符串，返回一个的数组
		str="提笔、凝神、静气,述其文而汇其意,塑其形而传其神,文不离意,以意浮其文";
		String list[]=str.split(",");
		for(String string:list){
			System.out.println(string);
		}
		//替换
		System.out.println(str.replace("提笔", "执笔"));
		
	}
}
