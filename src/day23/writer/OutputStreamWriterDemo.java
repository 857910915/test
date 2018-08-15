package day23.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
//写出字节流
	public static void main(String[] args) throws IOException {
		// 初始化一个字符流对象
		OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\111.txt",true));
		//写操作
		//写单个字符
		writer.write("q");
		//写入一个字符数组
		char[]cbuf={'s','d','c','a','l','m'};
		writer.write(cbuf);
		//3.刷入数组，从那个位置开始到哪个位置结束
		writer.write(cbuf, 1, 4);
		//写入一个字符串
		writer.write("Hello");
		//刷入
		writer.flush();
		//关闭
		writer.close();
	}
}
