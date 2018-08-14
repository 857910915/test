package day21.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//dog类
class Dog {
	String name;
	String varieties;
	public Dog() {
		// TODO 自动生成的构造函数存根
	}
	public  Dog(String name,String vaieties) {
		this.name=name;
		this.varieties=vaieties;
	}
	@Override
	public String toString() {
		System.out.println("name=="+name+"\tvarieties=="+varieties);
		return super.toString();
	}
}
public class ListTest {
	public static void main(String[] args) {
		//初始化一个ArrayList对象
		ArrayList<Dog>list=new ArrayList<Dog>();
		System.out.println("ArrayList-----------------");
		list.add(new Dog("欧欧","雪纳瑞"));
		list.add(new Dog("亚亚","拉布拉多"));
		list.add(new Dog("菲菲","拉布拉多"));
		list.add(new Dog("美美","雪纳瑞"));
		list.toString();
		
		//包含
		System.out.println("是否存在-------------");
		for (Iterator<Dog> iterator = list.iterator(); iterator.hasNext();) {
			Dog dog = (Dog) iterator.next();
			boolean b=dog.name.contains("菲菲");	
			if (b) {
				System.out.println(b);
			}
		}
		System.out.println("删除------------");
		for (Iterator<Dog> iterator = list.iterator(); iterator.hasNext();) {
			Dog dog = (Dog) iterator.next();
			if (dog.name.equals("欧欧")) {
				iterator.remove();
			}
			if (dog.name.equals("菲菲")) {
				iterator.remove();
			}
		}
		list.toString();
		//初始化一个LinkedList对象
	LinkedList<Dog>list1=new LinkedList<Dog>();
	list1.add(new Dog("欧欧","雪纳瑞"));
	list1.addFirst(new Dog("亚亚","拉布拉多"));
	list1.addLast(new Dog("菲菲","拉布拉多"));
	list1.add(new Dog("美美","雪纳瑞"));
	System.out.println("LinkedList------------");
	list1.toString();
	System.out.println("查询-------------");
	for (Dog dog : list1) {
		if (dog.name.equals("亚亚")) {
			System.out.println("存在");
			break;
		}
	}
	System.out.println("要删除的--------");
	System.out.println(list1.pollFirst().name);
	System.out.println(list1.pollLast().name);
	System.out.println("删除------------");
	list1.toString();
	
	}
}
