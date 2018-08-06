package day11.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化数组
		String[]str=new String[3];
		str[0]="语文";
		str[1]="数学";
		str[2]="英语";
		//初始化键盘录入对象
		Scanner in=new Scanner(System.in);
		System.out.println("请输入1-3的数字");
		try {
			int a=in.nextInt();
			System.out.println(str[a-1]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入错误");
		}finally {
			System.out.println("欢迎提出建议");
		}

	}

}
