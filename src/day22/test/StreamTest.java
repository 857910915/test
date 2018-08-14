package day22.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制一个文件
public class StreamTest {
	public static void main(String[] args) throws IOException   {
		//创建一个输入流对象
		FileInputStream input=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\工具\\npp.7.5.7.Installer.x64.exe");
		//创建一个输出流对象
		FileOutputStream output=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\npp.7.5.7.Installer.x64.exe");
		//声明一个缓存区
		byte[]b=new byte[1024];
		int len=0;
		while((len=input.read(b))!=-1){
			//写入操作
			output.write(b,0,len);
		}
		//强制写入
		output.flush();
		//关闭流
		output.close();
		input.close();
		
			
	}
}
