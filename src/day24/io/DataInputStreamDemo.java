package day24.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * DataInputStream
 * 		二进制输入流，可以读取文件，将文件中对应的数据类型还原成java的基本数据类型
 * */
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//初始化对象
		DataInputStream input=new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\data.txt"));
		//读取数据，必须按照存入的顺序来读取
		System.out.println(input.readBoolean());
		System.out.println(input.readByte());
		System.out.println(input.readChar());
		System.out.println(input.readDouble());
		System.out.println(input.readFloat());
		System.out.println(input.readLong());
		System.out.println(input.readInt());
		System.out.println(input.readShort());
		System.out.println(input.readUTF());
		//关闭流
		input.close();
	}
}
