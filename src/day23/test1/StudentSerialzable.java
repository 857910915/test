package day23.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

//创建学生类
@SuppressWarnings("serial")
class Student implements Serializable{
	//属性
	private int sId;
	private String name;
	private int age;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//构造方法
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	public  Student(int sId,String name,int age) {
		this.sId=sId;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		System.out.println("sId:"+this.sId+"\tname:"+this.name+"\tage:"+this.age);
		return super.toString();
	}
}
public class StudentSerialzable {
	//序列化操作
	public static void serializeOperation(ArrayList<Student>list) throws IOException {
		//初始化对象，关联字节输出流
		FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\Student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		//序列化对象
		oos.writeObject(list);
		//强制刷入
		oos.flush();
		//关闭流
		oos.close();
		out.close();
	}
	//反序列化操作
	@SuppressWarnings("unchecked")
	public static void antiSerializationOperation() throws IOException, ClassNotFoundException {
		//初始化对象，关联输入流
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\Student.txt");
		ObjectInputStream ois=new ObjectInputStream(in);
		//反序列化
		ArrayList<Student>list=(ArrayList<Student>)ois.readObject();
		//输出
		for (Student student : list) {
			student.toString();
		}
		//关闭流
		ois.close();
		in.close();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//初始化ArrayList对象
		ArrayList<Student>list=new ArrayList<Student>();
		//添加数据
		list.add(new Student(1,"一叶知秋",21));
		list.add(new Student(2,"浪子一秋",21));
		list.add(new Student(3,"葬剑山庄",21));
		list.add(new Student(4,"剑侠情缘",21));
		list.add(new Student(5,"葬剑灬尊",21));
		//序列化
		serializeOperation(list);
		//反序列化
		antiSerializationOperation();
	}
}
