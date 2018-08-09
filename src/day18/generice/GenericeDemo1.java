package day18.generice;
/*
 * 泛型方法
 * 		与一般定义的方法一致
 * */
public class GenericeDemo1 {
	public static <T> void printList(T[]arr) {
		//遍历数组
		for (T t : arr) {
			System.out.print(t+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer []arr={1,2,3,44,6};
		Double[]arr1={1.1,2.1,4.6,5.0};
		Character[]arr2={'q','w','a','s','a'};
		//调用方法
		printList(arr);
		printList(arr1);
		printList(arr2);
	}
}
