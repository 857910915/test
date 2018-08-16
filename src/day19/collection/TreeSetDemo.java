package day19.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSetDemo特点
 * 		1.不允许有null
 * 		2.不允许有重复元素
 * 		3.添加的顺序是无序的
 * 		4.内容可以排序
 * */
public class TreeSetDemo {
	
	public static void main(String[] args) {
		//初始化一个TreeSet对象
		TreeSet<Integer>set=new TreeSet<Integer>();
		//添加
		set.add(13);
		set.add(11);
		set.add(18);
		set.add(6);
		set.add(3);
		//set.add(null);//不允许有null
		//查看
		System.out.println(set.contains(1));//是否包含指定的元素
		System.out.println(set.isEmpty());//判断是否为空
		System.out.println(set.size());//大小
		System.out.println(set.first());//返回最小的元素
		System.out.println(set.last());//返回最大的元素
		System.out.println(set.lower(10));//以某个值为基准，返回小于该元素的临近数
		System.out.println(set.higher(11));//返回临近的大数
		System.out.println(set.toString());
		//删除
		System.out.println("删除-----------------");
		set.remove(3);
		System.out.println(set.pollFirst());//获取删除最小元素
		System.out.println(set.pollLast());//大
		System.out.println(set.toString());
		//获取所有元素
		System.out.println("foreach-----------------");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		//迭代器
		System.out.println("迭代器---------------------");
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
