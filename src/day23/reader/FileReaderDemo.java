package day23.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader是InputStreamReader的子类
 * 只能使用平台默认的编码格式
 * */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建FileReader对象
		FileReader reader=new FileReader("C:\\Users\\Administrator\\Desktop\\111.txt");
		//读取字符
		//声明一个缓冲区
		char[]cbuf=new char[10];
		int len=0;
		//循环读取字符
		while ((len=reader.read(cbuf))!=-1) {
			//处理字符
			System.out.print(new String(cbuf,0,len));
		}
		//关闭
		reader.close();
	}
}
