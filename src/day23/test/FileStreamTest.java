package day23.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) throws IOException {
		//创建输入输出流对象，关联文件
		FileInputStream input=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\工具\\jdk\\jdk-8u171-windows-x64.exe");
		FileOutputStream ouput=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\jdk.exe");
		//声明缓冲池
		byte[]b=new byte[1024];
		int len=0;
		//读取文件
		while ((len=input.read(b))!=-1) {
			//读取多少写入多少
			ouput.write(b, 0, len);
		}
		//强制刷入流中的数据到文件中
		ouput.flush();
		//关闭流
		input.close();
		ouput.close();		
	}
}
