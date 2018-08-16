package day23.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
@SuppressWarnings("serial")
class Dog implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Dog() {
		// TODO 自动生成的构造函数存根
	}
	public Dog(String name) {
		this.name=name;
	}
}
//序列化操作
public class SerializableDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//创建输出对象。关联字节输入流
		FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\321.txt");	
		ObjectOutputStream oos=new ObjectOutputStream(out);	
		//初始化ArrayList对象
		ArrayList<Dog>list=new ArrayList<Dog>();
		list.add(new Dog("mm"));
		list.add(new Dog("oo"));
		list.add(new Dog("qq"));
		list.add(new Dog("ww"));
		list.add(new Dog("rr"));
		/*Dog dog=new Dog();
		dog.setName("mm");*/
		//将对象写到文件
		//oos.writeObject(list);
		oos.writeObject(list);
		//强制刷入
		oos.flush();
		//关闭流
		oos.close();
		out.close();
		//反序列化操作
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\321.txt");
		ObjectInputStream ois=new ObjectInputStream(in);
		list=(ArrayList<Dog>)ois.readObject();
		for (Dog dog : list) {
			System.out.println(dog.getName()+"  ");
		}
		//System.out.println();
		ois.close();
		in.close();
	}
}
