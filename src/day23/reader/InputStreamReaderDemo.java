package day23.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader 是读取字符类
 * 读取文件以字符为单位，底层还是字节流
 * */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建一个字符流对象
		//1.1创建字节流对象，关联到要操作的文件
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\day01\\FirstDemo.java");
		//1.2创建字符流对象，关联字节流
		InputStreamReader reader=new InputStreamReader(in);
		//2.读取字符
		/*//读取单个字符
		System.out.println(reader.read());
		//读取一串字符，把字符存在字符数组中
		char []cbuf=new char[10];
		int len=reader.read(cbuf);
		System.out.println(len);
		//从流中读取一定长度的字符，存到缓存区，从某个位置开始，读取长度
		//reader.read(cbuf, offset, length);*/		
		//初始化一个缓存区
		char[]cbuf=new char[10];
		//设置长度
		int len=0;
		//循环读取数据
		while ((len=reader.read(cbuf))!=-1) {
			//处理接受的数据
			System.out.print(new String(cbuf,0,len));
		}		
		//3.关闭流
		in.close();
		reader.close();
	}
}
