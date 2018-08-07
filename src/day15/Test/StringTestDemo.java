package day15.Test;

import java.util.Scanner;

public class StringTestDemo {
	public static void main(String[] args) {
		//初始化键盘录入对象
		Scanner in=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String name=in.next();

		//判断用户名是否符合要求
		while (!rightName(name)) {
			System.out.print("请输入正确的用户名:");
			name=in.next();			
		}

		//判断手机号
		System.out.println("请输入手机号：");
		String phone=in.next();
		while (!verificationPhone(phone)) {
			System.out.println("手机号不符合要求，请重新输入：");
			phone=in.next();
		}

		//判断qq号
		System.out.println("请输入QQ号码：");
		String qq=in.next();
		while (!judgeQQ(qq)) {
			System.out.println("请输入正确的QQ号码！");
			qq=in.next();
		}
		//分割字符串
		String str="蒹葭苍苍,白鹭为霜,所谓伊人,再水一方";
		cutString(str);

		//替换字符串
		//replace(str);
	}
	//1.用户名是6-16位，可以是字母数字下划线
	//判断用户名是否符合要求
	public static boolean rightName(String name) {
		//1.判断字符串长度
		if (name.length() >= 6 && name.length() <= 16) {
			// 2.字符串分割成一个字符数组
			char cs[] = name.toCharArray();
			// 3.遍历字符数组，用字符和 字母 数字 下划线的 编码进行对比
			// 小写字母取值 97-122
			// 大写字母取值 65-90
			// 下划线 95
			// 数字 48-57
			for (char c : cs) {
				// 判断是否在范围内
				if (!(c >= 97 && c <= 122 || c >= 65 && c <= 90 || c >= 48 && c <= 57 || c == 95))
					return false;
			}
			return true;
		}
		return false;		
	}
	//2.手机号码验证
	public static boolean verificationPhone(String phone) {
		//判断长度
		if (phone.length()!=11){
			return false;
		}
		//分割字符串
		char []cs=phone.toCharArray();
		//判断是否是全数字，同时判断第一位第二位的值
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];// 通过索引取出值
			// 判断是否是数字
			if (c >= 48 && c <= 57) {
				// 是否是第一个
				if (i == 0 && c != 49)
					return false;
				else if (i == 1) {
					if (!(c == 51 || c == 53 || c == 55 || c == 56))
						return false;
				}
			} else {
				// 不是数字
				return false;
			}
		}
		return true;	
	}
	//3.qq号码验证
	public static boolean judgeQQ(String qq) {
		//判断出的
		if (!(qq.length()>=5&&qq.length()<=10)) {
			return false;
		}
		//分割字符串
		char []cs=qq.toCharArray();
		//判断是不是纯数字,首位不能为0
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			//判断是否为纯数字
			if (c>=48&&c<=57) {
				//判断首位不能为0 
				if (i==0&&i==48) 
					return false;
			}else {
				return false;
			}
		}
		return true;

	}
	//4.“蒹葭苍苍,白鹭为霜,所谓伊人,再水一方”以逗号来分割字符串 
	public static void cutString(String str) {
		String list[]=str.split(",");
		for(String string:list){
			System.out.println(string);
		}
	}
	//5.第四题中文本 替换叠词为，"Java"
	public static void replace(String str) {
		//获取每个元素的char字符
		char []ch=new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i]=str.charAt(i);
			if(i<str.length()-1){
				if (ch[i]==ch[i+1]) {
					String str1=str.substring(0,i);
					String str2=str.substring(i+2);
					str=str1+"Java"+str2;
					System.out.println(str);
				}
			}
		}
	}
}
