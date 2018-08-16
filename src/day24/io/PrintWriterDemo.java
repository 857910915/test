package day24.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// 初始化对象
		PrintWriter writer=new PrintWriter("C:\\Users\\Administrator\\Desktop\\Java1807\\p2.txt");
		//写数据
		writer.print(true);
		writer.print("qq");
		writer.print(123);
		writer.print(111.1);
		//带换行
		writer.println("Hello");
		writer.println(false);
		writer.println(12.45F);
		writer.println('f');
		//强制刷入
		writer.flush();
		//关闭流
		writer.close();
	}

}
