package day22.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制文件
public class StreamDemoTest {
	public static void main(String[] args) throws IOException {
		//声明文件路径
		String path1="C:\\Users\\Administrator\\Desktop\\test\\111.txt";
		String path2="C:\\Users\\Administrator\\Desktop\\test\\one\\111.txt";
		//创建输入流对象，关联文件
		FileInputStream input=new FileInputStream(path1);
		//创建输出流对象，并关联文件
		FileOutputStream output=new FileOutputStream(path2);
		//读取文件
		byte[]b=new byte[10];
		int len=0;
		while ((len=input.read(b))!=-1) {
			//处理数据
			output.write(b,0,len);		
		}
		//将数据强制刷入流中
		output.flush();		
		//关闭流
		input.close();
		output.close();

	}
}
