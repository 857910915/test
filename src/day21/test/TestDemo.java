package day21.test;

//数组算法
public class TestDemo {
	public static void main(String[] args) {
		//初始化数组
		int []num={1,4,2,9,6,3};
		//冒泡排序
		System.out.println("冒泡排序-----------");
		bubbleSort(num);
		//选择排序
		System.out.println("选择排序-----------");
		selectSort(num);
		//插入排序
		System.out.println("插入排序-----------");
		insertSort(num);
		//二分查找
		//初始化数组
		int[]num1={10,11,12,13,14,15,16};
		System.out.println("二分搜索-----------");
		int a=binarySearch(num1, 15);
		System.out.println(a);
	}
	//冒泡排序
	public static void bubbleSort(int[]num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			//内层循环控制每轮的比较次数
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					swap(num, j, j+1);
				}
			}			
		}
		//打印输出
		list(num);
	}
	//选择排序
	public static void selectSort(int[]num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			//声明一个指针，默认为最小值下标
			int p=i;
			//内层循环控制每轮的比较次数
			for (int j = i+1; j < num.length; j++) {
				if (num[p]>num[j]) {
					p=j;//移动下标
				}			
			}
			//一轮比较结束，交换数据
			swap(num, i, p);
		}
		list(num);
	}
	//插入排序
	public static void insertSort(int[]num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length; i++) {
			//内层循环控制每轮的比较次数
			for (int j = i; j >0; j--) {
				if (num[j]<num[j-1]) {
					swap(num, j, j-1);				
				}				
			}
		}
		list(num);
	}
	//二分搜索
	public static int binarySearch(int[]num1,int querry) {
		int low=0;
		int high=num1.length-1;
		while (low<=high) {
			int mid=(low+high)/2;
			if (querry==num1[mid]) {
				return mid;
			}else if (querry>num1[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
	//交换数据
	public static void swap(int []num,int a,int b) {
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
}
