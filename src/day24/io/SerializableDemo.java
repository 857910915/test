package day24.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//如果该类要支持序列化技术，必须实现接口 Sreializable
@SuppressWarnings("serial")
class Student implements Serializable{
	String name;
	int age;
}
public class SerializableDemo {
	//序列化：对象通过编码技术转换成二进制数据存储起来
	public static void writeObj() throws FileNotFoundException, IOException {
		//初始化对象
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\Student1.txt"));
		out.writeChar('C');
		out.writeBoolean(true);
		Student stu=new Student();
		stu.name="qq";
		stu.age=21;
		out.writeObject(stu);
		//强制刷入
		out.flush();
		//关闭流
		out.close();
	}
	//反序列化：将二进制数据通过解码技术，构建还原成原来的对象
	public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\Student1.txt"));
		//读取数据
		System.out.println(in.readChar());
		System.out.println(in.readBoolean());
		Student stu=(Student)in.readObject();
		System.out.println(stu.name+"  "+stu.age);
		//关闭流
		in.close();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		writeObj();
		readObj();
	}
}