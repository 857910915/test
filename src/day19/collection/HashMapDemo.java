package day19.collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//初始化对象
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		//添加
		map.put(1, "qq");
		map.put(2, "ww");
		map.put(3, "aa");
		map.put(4, "ss");
		System.out.println(map.get(1));
		//查询所有元素
		System.out.println(map.values());
		//删除
		map.remove(3);
		System.out.println("删除------------------");
		System.out.println(map.values());
		//查询
		System.out.println("查询-------------------");
		System.out.println(map.size());
		System.out.println(map.containsKey(3));//通过key值判断
		System.out.println(map.containsValue("qq"));//通过value值判断
	}
}
