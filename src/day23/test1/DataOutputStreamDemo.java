package day23.test1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//写二进制文件
public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\222.txt",true);
		DataOutputStream dos=new DataOutputStream(out);
		//写操作
		String str="1232123123qwsx";
		byte[]b=str.getBytes();
		dos.write(b);
		dos.write(b, 2, 4);
		dos.write(3);
		dos.writeBoolean(true);
		dos.writeByte(3);
		dos.writeBytes("asd");
		
		System.out.println(dos.size());
		//强制刷入
		dos.flush();
		//关闭
		dos.close();
		out.close();
	}
}
