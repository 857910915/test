package day21.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap特点
 * 		1.根据key进行自动排序
 * 		2.key不允许为null
 * */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		//初始化一个TreeMap对象
		TreeMap<Integer, String>map=new TreeMap<Integer, String>();
		//添加
		map.put(6, "浪子一秋");
		map.put(2, "一叶知秋");
		map.put(1, "葬剑山庄");
		map.put(9, "武林至尊");
		map.put(4, "葬剑灬尊");
		System.out.println(map.toString());
		//取值
		System.out.println(map.firstEntry());
		//获取所有元素
		Set<Entry<Integer, String>>en=map.entrySet();
		for (Entry<Integer, String> entry : en) {
			System.out.print(entry.getKey()+"\t"+entry.getValue());
			System.out.println();
		}
		System.out.println(map.floorEntry(3));		
	}
}
