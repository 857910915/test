package day21.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
	public static void main(String[] args) {
		//向指定的列表中添加元素
		ArrayList<String>list=new ArrayList<String>();
		Collections.addAll(list,"id ","name","age","sex");
		System.out.println(list.toString());
		//使用二分查找法查找指定元素
		System.out.println(Collections.binarySearch(list, "sex"));
		//将列表中的元素复制到另一个列表中
		ArrayList<String>dest=new ArrayList<String>();
		Collections.addAll(dest,"id1 ","name","age","sex","nn");
		Collections.copy(dest, list);
		System.out.println(dest.toString());
		//反转顺序
		Collections.reverse(dest);
		System.out.println(dest.toString());
		//获取最值,assic码值
		System.out.println(Collections.max(dest));
		System.out.println(Collections.min(dest));
		//比较器
		Collections.reverseOrder();
		System.out.println(dest.toString());
		//Collections.reverseOrder(Comparator<String>cmp);
		
		//填充元素
		Collections.fill(dest,"score");
		System.out.println(dest.toString());
	}
}
