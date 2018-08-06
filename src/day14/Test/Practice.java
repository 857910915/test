package day14.Test;
//数组算法练习
public class Practice {
	public static void main(String[] args) {
		//初始化一个一维数组
		int []num={1,5,3,9,34,12};
		System.out.println("原始数组");
		list(num);
		bubbleSort(num);
		System.out.println("冒泡排序");
		list(num);
		selectSort(num);
		System.out.println("选择排序");
		list(num);
		insertSort(num);
		System.out.println("插入排序");
		list(num);
		//初始化一个一维数组
		int[]num1={1,2,3,4,5,6,7,8};
		System.out.println("二分查找");
		int c=binaryChop(num1, 3);
		System.out.println(c);
	}
	//冒泡排序
	public static void bubbleSort(int[] num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			//内层循环控制每轮的比较次数
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					//交换数据
					swap(num, j, j+1);
				}				
			}			
		}
	}
	//选择排序
	public static void selectSort(int []num) {		
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			int p=i;//声明下标,默认为最小数
			//内层循环控制每轮的比较次数
			for (int j = i+1; j < num.length; j++) {
				if (num[p]>num[j]) {
					p=j;//移动下标
				}				
			}
			if (p!=i) {
				swap(num, p, i);
			}
		}
	}
	//插入排序
	public static void insertSort(int[]num) {
		//外层循环控制比较轮数
		for (int i = 0; i < num.length-1; i++) {
			//内层循环控制每轮的比较次数
			for (int j = i+1; j >0; j--) {
				if (num[j]<num[j-1]) {
					swap(num, j, j-1);
				}else {
					break;
				}				
			}			
		}
	}
	//二分查找
	public static int binaryChop(int []num1,int querry) {
		//声明两个下标，最低位和最高位
		int lowIndex=0;
		int highIndex=num1.length;
		while (lowIndex<=highIndex) {
			int midIndex=(lowIndex+highIndex)/2;
			if (num1[midIndex]==querry) {
				return midIndex;
			}else if (num1[midIndex]>querry) {
				highIndex=midIndex-1;
			}else {
				lowIndex=midIndex+1;
			}
		}
		return -1;
		
	}
	//交换数据
	public static void swap(int[]num,int a,int b) {
		int tmp=0;
		tmp=num[a];
		num[a]=num[b];
		num[b]=tmp;

	}
	//打印数组
	public static void list(int[]num) {
		for(int tmp:num){
			System.out.print(tmp+"\t");
		} 
		//换行
		System.out.println();
	}
}
