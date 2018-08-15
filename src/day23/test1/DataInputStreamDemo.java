package day23.test1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//读取二进制文件
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\个人总结\\Java学习第三天\\Test2.class");
		DataInputStream dis=new DataInputStream(in);
		//读取文件
		//声明缓冲区
		byte []b=new byte[10];
		
		System.out.println(dis.read(b));//从包含的输入流中读取一些字节数，并将它们存储到缓冲区数组 b 。
		System.out.println(dis.read());
		System.out.println(dis.read(b, 3, 4));//从包含的输入流读取最多 len个字节的数据为字节数组。
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		//System.out.println(dis.readLine());
		System.out.println(dis.readShort());
		System.out.println(dis.readUnsignedByte());
		System.out.println(dis.readUnsignedShort());
		//System.out.println(dis.readUTF());
		//System.out.println(dis.readUTF(dis));
		System.out.println(dis.skipBytes(1));
		int len=0;
		while ((len=dis.read(b))!=-1) {
			String str=new String(b,0,len);
			System.out.println(str);
		}
		//关闭
		dis.close();
		in.close();
	}
}
