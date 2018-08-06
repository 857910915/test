package day11.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throw  关键字  抛出异常
 * 一旦手动抛出一个异常，throw以下代码将不会执行,类似return
 * throw 异常对象
 * 在使用throw的时候，必须声明异常
 * */
public class Exception4 {
	public static void method1() throws Exception {
		System.out.println("Hello");
		//创建一个异常对象
		Exception e=new Exception("异常的信息");
		//手动抛出异常
		throw e;
		//System.out.println("Nice to meet you!");
	}
	//编译异常，编译的时候必须进行异常声明
	public static void method2() throws FileNotFoundException {
		//文件操作
		File file=new File("");
		//打开文件
		FileInputStream in=new FileInputStream(file);
	}
	//在运行时可能出现异常信息，运行时异常，也是需要对异常进行处理
	public void method3() {
		int a=10;
		int b=0;
		System.out.println("a/b="+a/b);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			method1();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
