package day25.test;

public class TestDemo {
	//冒泡排序
	public static void bubbleSort(int[]num) {
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					//交换数据
					swap(num, j, j+1);
				}	
			}	
		}
		list(num);
	}
	//选择排序
	public static void seleteSort(int []num) {
		for (int i = 0; i < num.length-1; i++) {
			int p=i;
			for (int j = i; j < num.length; j++) {
				if (num[p]>num[j]) {
					p=j;
				}
			}
			swap(num, p, i);
		}
		list(num);
	}
	//插入排序
	public static void insertSort(int[]num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j >0; j--) {
				if (num[j]<num[j-1]) {
					swap(num, j, j-1);
				}				
			}			
		}
		list(num);
	}
	//交换数据
	public static void swap(int[]num,int a,int b) {
		int tmp=num[a];
		num[a]=num[b];
		num[b]=tmp;
	}
	//打印输出
	public static void list(int[]num) {
		for (int i : num) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 初始化数组
		int[]num={12,32,11,4,63,22};
		//bubbleSort(num);
		//seleteSort(num);
		insertSort(num);
	}
}
