package day22.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//输入流  将程序外部的数据，存储到内存中
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1.创建一个输入字节流对象，关联要操作的文件，打开流
		//1.1声明文件路径
		String path="C:\\Users\\Administrator\\Desktop\\test\\111.txt";
		//1.2初始化输入流对象
		//FileInputStream input=new FileInputStream(new File(path));
		FileInputStream input=new FileInputStream(path);
		//2.读取操作
		//2.1查看流中剩余字节
		System.out.println(input.available());
		//2.2读取一个字节
		System.out.println(input.read());//assic码值
		System.out.println(input.available());
		//byte[]b=new byte[input.available()];//声明缓存区，不建议使用，如果文件太大，系统可能会崩溃
		//int len=input.read(b);//将流中的数据读取到byte数组中，返回的是本次接受的长度
		//System.out.println(len);
		byte[]b=new byte[5];
		//读取长度==-1，说明已经读取到文件的尾部
		int len=0;
		while ((len=input.read(b))!=-1) {
			//从b数组中处理接受的数据 
			String tmp=new String(b,0,len,"GBK");		
			System.out.print(tmp);
		}
		//System.out.println();
		//System.out.println(input.read(b));
		//System.out.println(input.available());
		//3.关闭流
		input.close();
	}
}
