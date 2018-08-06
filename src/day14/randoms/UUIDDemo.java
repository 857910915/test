package day14.randoms;

import java.util.UUID;

public class UUIDDemo {
	//UUID是128位的随机数，可以产生唯一的随机数,用16进制表示
	public static void main(String[] args) {
		//String uid=UUID.randomUUID().toString();
		//1.获取UUID对象
		UUID uid=UUID.randomUUID();
		//3.将对象转换成String
		String str=uid.toString();
		System.out.println(str);
		//3.去掉-
		String newStr=str.replace("-", "");
		System.out.println(newStr);
	}
}
