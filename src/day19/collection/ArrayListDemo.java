package day19.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * ArrayList
 * 		1.底层由数组实现
 * 		2.有序的
 * 		3.允许重复
 * 		4.允许有null
 * 		5.不支持同步
 * */
class Student{
	String name;
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	public  Student(String name) {
		this.name=name;	
	}
}
public class ArrayListDemo {
	public static void main(String[] args) {
		//初始化一个对象
		ArrayList<String>list=new ArrayList<String>();//创建一个空的对象
		//添加
		list.add("qww");//在尾部添加一个元素
		list.add("1qe");
		list.add("2rr");
		list.add("zzss");
		list.add(null);
		list.add(2, "快快快");//在指定位置添加
		System.out.println(list.toString());
		//修改,指定位置
		list.set(0, "尊");
		//删除
		list.remove(3);//删除指定位置的元素
		list.remove("2rr");//删除列表中指定首次出现的元素
		System.out.println(list.toString());
		Vector<String>v=new Vector<String>();
		v.add("1qe");
		v.add("hh");
		//list.removeAll(v);//删除两个集合中相等的元素  删除交集
		//list.clear();//删除全部
		System.out.println(list.toString());
		//查询
		System.out.println("通过下标取值==="+list.get(1));
		System.out.println("通过元素查找第一次出现的索引==="+list.indexOf("尊"));
		System.out.println("通过元素查找最后一次出现的索引==="+list.lastIndexOf("尊"));
		System.out.println("判断是否包含指定元素"+list.contains("hh"));
		System.out.println("判断是否为空列表"+list.isEmpty());
		
		//获取所有元素
		for (String str : list) {
			System.out.print(str+"  ");
		}
		System.out.println();
		//方法二
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.print(string+"  ");
		}
		System.out.println();
		//修改指定内容的元素
		System.out.println("写修改----------");
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			if (string==null) {
				continue;
			}if (string.equals("尊")) {
				list.set(i,"zjsz");			
			}			
		}
		System.out.println(list.toString());
		
		//删除指定元素		
		//初始化对象
		ArrayList<Student>list1=new ArrayList<Student>();
		list1.add(new Student("qq"));
		list1.add(new Student("qqa"));
		list1.add(new Student("qqz"));
		//遍历成员
		for (Student student : list1) {
			System.out.print(student.name+"  ");
		}
		System.out.println();
		
		//删除指定元素
		//list.remove();
		System.out.println("删除---------------");
		/*for (int i = 0; i < list1.size(); i++) {
			Student student=list1.get(i);
			if (student==null) {
				continue;
			}if (student.name.equals("qqz")) {
				list1.remove(i);
			}			
		}*/
		//foreach遍历删除
		for (Student student : list1) {
			//判断内容是否相等
			if (student==null) {
				continue;
			}
			//判断name
			if (student.name.equals("qqa")) {
				//list.remove(student);//无法删除				
			}
		}
		//通过迭代器
		//1.获取迭代器对象
		Iterator<Student>it=list1.iterator(); //迭代器是一个副本
		boolean result=it.hasNext();//判断迭代器中是否还有更多的元素
		//取出下一个元素
		/*Student stu1=it.next();//每调用一次next就取出一个元素
		System.out.println("name==="+stu1.name);*/
		for (; it.hasNext();) {
			Student stu1 = it.next();
			System.out.println("name==="+stu1.name);
			//删除元素
			if (stu1!=null) {
				if (stu1.name.equals("qq")) {
					it.remove();//删除当前指针指向的对象
				}
			}			
		}
		//查看
		for (Student student : list1) {
			System.out.print(student.name+"  ");
		}
	}
}
