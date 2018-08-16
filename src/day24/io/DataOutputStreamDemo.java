package day24.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream
 * 		二进制输出流，可以将java的基本类型直接写到文件中
 * */
public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//初始化对象
		DataOutputStream out=new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\data.txt"));
		//写数据
		out.writeBoolean(true);//写入一个boolean值类型
		out.writeByte(3);//写入一个字节类型
		out.writeChar('q');
		out.writeDouble(1.1);
		out.writeFloat(3.14F);
		out.writeLong(333L);
		out.writeInt(12);
		out.writeShort(2209);
		out.writeUTF("asda");
		//强制刷入
		out.flush();
		//关闭流
		out.close();
	}
}
