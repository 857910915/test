package day23.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		//创建输入输出流对象
		FileReader reader=new FileReader("C:\\Users\\Administrator\\Desktop\\Java1807\\day02\\work.txt");
		FileWriter writer=new FileWriter("C:\\Users\\Administrator\\Desktop\\Java1807\\work.txt");
		//读取操作
		char[]cbuf=new char[10];
		int len=0;
		while ((len=reader.read(cbuf))!=-1) {
			String str=new String(cbuf,0,len);
			writer.write(str);
		}
		//强制刷入
		writer.flush();
		//关闭
		writer.close();
		reader.close();
	}
}
