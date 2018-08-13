package day21.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 * HashMap
 * 		1.无序的
 * 		2.数据以键值对的方式存储
 * 		3.可以允许有一个key键为空的成员
 * 		4.key值唯一，value值不唯一
 * */
public class HashMapDemo {
	public static void main(String[] args) {
		//1.初始化一个HashMap对象
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		//2.添加数据
		map.put(0, 151);
		map.put(1, 152);
		map.put(3, 153);
		map.put(2, 154);
		map.put(null, 111);
		map.put(4, 0);
		System.out.println(map.toString());
		//3.修改
		map.put(null, 154);
		System.out.println(map.toString());
		//4.删除元素，通过key删除value
		map.remove(null);
		System.out.println(map.toString());
		//5.查看成员
		//通过key获取value
		System.out.println(map.get(3));
		//判断是否包含指定的key值
		System.out.println(map.containsKey(null));
		//判断是否包含value值
		System.out.println(map.containsValue(152));
		//查看键值对的个数
		System.out.println(map.size());
		//获取所有的key值
		System.out.println("key值");
		Set<Integer>keys=map.keySet();
		for (Integer integer : keys) {
			System.out.print(integer+"\t");
		}
		System.out.println();
		System.out.println("value值");
		//获取到所有的value值
		Collection<Integer>values=map.values();
		for (Integer integer : values) {
			System.out.print(integer+"\t");
		}
		System.out.println();
		//获取所有的映射关系，进行遍历map
		Set<Entry<Integer, Integer>>en=map.entrySet();
		for (Entry<Integer, Integer> entry : en) {
			System.out.print(entry.getKey()+"--"+entry.getValue());
			System.out.println();
		}
	}
}
