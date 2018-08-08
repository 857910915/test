package day14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// 1.创建一个正则表达式
		String reg="1[1578]\\d{9}";//规则
		String str="15123123123";//要匹配的字符串
		boolean r=str.matches(reg);
		System.out.println(r);

		//正则表达式匹配器
		//1.通过reg规则关联创建一个Patter对象
		Pattern p=Pattern.compile(reg);
		//2.关联要操作的字符串，获取一个匹配器对象
		Matcher m=p.matcher(str);
		//3.匹配字符串是否符合要求
		System.out.println(m.matches());
		//4.替换字符串
		System.out.println(m.replaceAll("Hello Java!"));
		//5.分割字符串
		Pattern p1=Pattern.compile("1");
		String str1[]=p1.split("123123123123");
		for (String tmp : str1) {
			System.out.println(tmp);
		}
		/**
		 * 组的捕获
		 * 	组就是一对小括号()
		 * 	(A(B(C(D)))(E))
		 * 1.ABCDE
		 * 2.BCD
		 * 3.CD
		 * 4.D
		 * 5.E
		 * */
		/*str="asdasdsdfsdfxzc";//操作字符串
		//划分组
		reg="zxc";
		//将正则转换成patter对象
		Pattern  p2=Pattern.compile(reg);
		//关联操作字符串，返回一个Matche对象
		Matcher m1=p2.matcher(str);
		//匹配
		System.out.println(m1.matches());*/

		//匹配身份证号码
		//首位不能为0，1-6代表区域
		//年份前两位19|20  后两位\\d{2}
		//月份(0[1-9]|(10|11|12))
		//天数([0-2][1-9])|10|20|30|31
		//后四位  前三位是数字  最后一位是数字或者X
		//reg="[1-8]\\d{5}(19|20)\\d{2}(0[1-9])|(10|11|12)([0-2][1-9])|(10|20|30|31)\\d{3}[0-9]|X";
		reg="[1-8]\\d{5}(\\d{4})(\\d{2})(\\d{2})\\d{3}[0-9X]";
		String scard="123123123123123123";
		//将正则转换成patter对象
		Pattern  p3=Pattern.compile(reg);
		//关联操作字符串，返回一个Matche对象
		Matcher m3=p3.matcher(scard);
		//查找
		if (m3.find()) {
			//捕获组
			System.out.println("总共"+m3.groupCount()+"组");
			for (int i = 1; i <=3; i++) {
				System.out.println("第"+i+"组"+m3.group(i));				
			}
			//获取组的开始索引，和结束索引
			System.out.println(m3.start(1)+"\t"+m3.end(1));
		}
	}
}
