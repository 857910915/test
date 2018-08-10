package day19.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/**
	 * HashSet特点
	 * 		1.元素是无序的
	 * 		2.不允许有重复的
	 * 		3.只允许一个null
	 * 		4.不支持同步
	 * */
	public static void main(String[] args) {
		// 1.创建HashSet对象
		HashSet<String>set=new HashSet<String>();
		//添加
		set.add("夜尽天明");
		set.add("夜尽天明");
		set.add(new String("夜尽天明"));
		set.add("诸子百家");
		set.add("君临天下");
		set.add(null);
		System.out.println(set.toString());
		//删除
		set.remove(null);
		//set.clear();//清空
		System.out.println(set.toString());
		//查看元素
		System.out.println(set.size());//查看元素个数
		System.out.println(set.isEmpty());//判断是否为空
		System.out.println(set.contains("诸子百家"));//查看是否包含
		//查看所有元素
		for (String string : set) {
			System.out.println(string);
		}
		//通过迭代器
		//获取迭代器对象
		System.out.println("迭代器------------");
		Iterator<String>it=set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			//如果遍历删除，必须使用迭代器
			it.remove();
		}
		System.out.println(set.isEmpty());
	}

}
