package day23.writer;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter是OutputStreamWriter的子类
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// 初始化一个FileWriter对象
		FileWriter writer=new FileWriter("C:\\Users\\Administrator\\Desktop\\123.txt",false);
		//写操作
		writer.write("This is  a FileWriter!");
		
		//刷入
		writer.flush();
		//关闭
		writer.close();
	}

}
