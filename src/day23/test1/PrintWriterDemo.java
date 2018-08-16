package day23.test1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//打印输出流
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		//创建对象
		PrintWriter writer=new PrintWriter("C:\\Users\\Administrator\\Desktop\\Java1807\\333.txt");
		//写操作
		String str="wdfasdad2132wqe34";
		writer.write(str);
		writer.write(123);
		writer.write(str,1,4);
		writer.print(1);
		writer.print(str);
		writer.append('q');
		writer.checkError();
		//强制刷入
		writer.flush();
		//关闭流
		writer.close();
		
	}
}
