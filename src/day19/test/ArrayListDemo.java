package day19.test;

import java.util.ArrayList;

public class ArrayListDemo <E>{
	//查询所有元素
	public static void printList(ArrayList<String> list) {
		for (String e : list) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		//初始化对象
		ArrayList<String> list=new ArrayList<String>();
		list.add("qqqq");
		list.add("zzzz");
		list.add("www");
		int i=list.size();
		System.out.println(i);
		list.add(2, "rfv");
		System.out.println("查看------------");
		printList(list);
		list.remove(0);
		list.set(2, "cvfd");
		System.out.println("----------------");
		printList(list);
		System.out.println(list.isEmpty());
	}
}
