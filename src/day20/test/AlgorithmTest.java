package day20.test;

//数组算法练习
public class AlgorithmTest {

	public static void main(String[] args) {
		//初始化一个数组
		int num[]={1,5,3,9,4};
		//bubbleSort(num);
		//list(num);
		//selectSort(num);
		//list(num);
		insertSort(num);
		list(num);
		
		int[]num1={3,4,5,6,7,8};
		System.out.println(seek(num1, 1));
		
	}
	//冒泡排序
	public static void bubbleSort(int []num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			//内层循环控制比较次数
			for (int j = 0; j < num.length-1-i; j++) {
				//判断大小
				if (num[j]>num[j+1]) {
					//交换数据
					sweep(num,j,j+1);
				}	
			}	
		}
	}
	//选择排序
	public static void selectSort(int[]num) {
		for (int i = 0; i < num.length-1; i++) {
			int p=i;//声明一个指针，默认为最小值
			for (int j = i+1; j < num.length; j++) {
				if (num[p]>num[j]) {
					p=j;
				}				
			}
			//一轮比较结束，交换数据
			sweep(num, i, p);
		}
	}
	//插入排序
	public static void insertSort(int []num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j >0; j--) {
				if (num[j]<num[j-1]) {
					sweep(num, j, j-1);
				}	
			}			
		}
	}
	//二分查找
	public static int seek(int []num,int query) {
		int low=0;
		int high=num.length-1;
		while (low<=high) {
			int mid=(low+high)/2;
			if (num[mid]==query) {
				return num[mid];
			}else if (query>num[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;		
	}
	//交换数据
	public static void sweep(int []num,int a,int b) {
		int tmp=num[a];
		num[a]=num[b];
		num[b]=tmp;	
	}
	public static void list(int []num) {
		for (int i : num) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
