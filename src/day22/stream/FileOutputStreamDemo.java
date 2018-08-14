package day22.stream;

import java.io.FileOutputStream;
import java.io.IOException;
//输出流：将计算机内存中的数据，写入到一个指定的文件中，或发送到网络
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1创建一个输出流并关联文件，自动打开流
		//1.1声明一个文件路径
		String path="C:\\Users\\Administrator\\Desktop\\test\\222.txt";
		//1.2创建一个输出流对象 boolean类型代表追加或者不追加
		//FileOutputStream output=new FileOutputStream(path);//每次内容会被覆盖
		FileOutputStream output=new FileOutputStream(path,false);//代表追加
		//2将内存中的数据，写入到一个指定的文件中
		//2.1将数据写入流中
		String str="你好!";
		//2.2将String类型转换成byte数组
		byte[]b=str.getBytes("UTF-8");
		//2.3写操作
		output.write(b);
		//output.write(b, 0, b.length);//将b数组中从0开始，数组的长度，写入到文件中
		//output.write(12);//单一写入一个字节
		//3强制刷入流中的数据到文件中
		output.flush();
		//4关闭流
		output.close();
	}
}
