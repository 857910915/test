package day19.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListResourceBundle;

public class LinkedListDemo {
	/**
	 * Linked特点实现了Deque、list接口的特性
	 * 		1.底层由链表实现 双向链表
	 * 		2.有序的
	 * 		3.允许重复
	 * 		4.允许有null
	 * 		5.具有队列和栈的特点
	 * 		6.不支持同步
	 * */
	public static void main(String[] args) {
		//初始化一个LinkedList对象
		LinkedList<String>list=new LinkedList<String>();
		//添加
		list.add("浪子一秋");
		list.add("一叶知秋");
		list.add("葬剑山庄");
		list.add("爱情公寓");
		list.addFirst("落梅拂雪");//在头部添加
		list.addLast("清风明月");//在尾部添加
		list.push("呆萌师傅");//压栈，从入口放一个，头是栈顶
		System.out.println(list.offer("独步天下"));//在尾部添加一个元素
		System.out.println(list.offerFirst("武林至尊"));//在头部添加一个元素
		System.out.println(list.offerLast("东方不败"));//在尾部添加一个元素
		//list.pop();//出栈
		System.out.println(list.toString());
		//修改
		list.set(6, "一醉千年");
		System.out.println(list.toString());
		//查询
		String element=list.poll();//取出head元素,同时删除元素
		System.out.println(element);
		System.out.println(list.pollFirst());
		System.out.println(list.getFirst());//取出第一个元素不删除
		System.out.println(list.getLast());//取出最后一个元素
		System.out.println(list.element());//取出第一个元素，不删除
		
		System.out.println(list.get(2));//返回指定位置元素
		System.out.println(list.indexOf("东方不败"));//首次出现元素的索引
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string+" ");
		}
		
		System.out.println(list.toString());
		//删除
		list.remove();//删除头
		list.remove(1);//通过索引删除
		list.remove("清风明月");//删除首次出现的元素
		System.out.println(list.toString());
		//遍历删除必须使用迭代器
		
	}
}
