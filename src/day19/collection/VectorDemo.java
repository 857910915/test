package day19.collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	/**
	 * Vector  向量
	 * 		1.底层实现是数组
	 * 		2.实现了list接口
	 * 		3.list接口  有序的，可以重复，可以有null值
	 * 		4.支持多线程
	 * */
	
	public static void main(String[] args) {
		//初始化一个Vector对象
		Vector<String> v=new Vector<String>();
		//添加数据
		v.add("qqq");
		v.add("aas");
		v.add("vfds");
		v.add("qwas");
		v.add("sadaz");
		//在指定位置添加数据
		v.add(1,"qpl");
		//将集合中的元素添加到当前集合中
		Vector<String>v1=new Vector<String>();
		v1.add("111");
		v1.addAll(v);
		v1.addElement("尾部添加");
		
		//修改元素
		v1.set(0, "尊");//修改指定位置的元素
		v1.setElementAt("林子", 2);
		//查询
		System.out.println("根据下标查询指定元素	"+v1.get(0));
		System.out.println("根据内容返回第一次出现的索引	"+v1.indexOf("林子"));
		System.out.println("根据内容返回最后一次出现的索引	"+v1.lastIndexOf("qpl"));
		System.out.println("判断是否包含指定元素	"+v1.contains("尊"));
		System.out.println("返回第一个位置的元素	"+v1.firstElement());
		System.out.println("最后一次	"+v1.lastElement());
		
		//删除元素
		v1.remove(3);//根据索引删除元素
		v1.remove("111");//根据元素删除，只删除第一次出现的元素
		
		//遍历向量
		System.out.println("遍历--------------------------");
		System.out.print("[");
		for (String string : v1) {
			System.out.print(string+"\t");
		}
		System.out.println("]");
		//枚举迭代器
		//将向量转换成Enumeration对象
		System.out.println("枚举-------------------");
		Enumeration<String>enums=v1.elements();
		while (enums.hasMoreElements()) {//判断枚举对象中是否有更多元素
			String string = (String) enums.nextElement();//返回下一个元素
			System.out.println(string);		
		}
		//截取字序列
		List<String>list=v1.subList(2, 5);
		System.out.println("截取---------");
		System.out.println(list);
	}
}
