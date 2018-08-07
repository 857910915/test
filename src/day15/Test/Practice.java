package day15.Test;

import java.util.concurrent.ThreadLocalRandom;

public class Practice {

	public static void main(String[] args) {
		// 双色球
		//初始化一个随机数对象
		ThreadLocalRandom random=ThreadLocalRandom.current();
		//初始化一个数组
		int []num=new int[6];
		//生成六个随机数
		//判断是否有相同的数
		for (int i = 0; i < num.length; i++) {
			num[i]=random.nextInt(0,32);
			for (int j = 0; j < i; j++) {
				if (num[i]==num[j]) {
					i--;
					break;
				}
			}
		}	
		for(int tem:num){
			System.out.print(tem+"\t");
		}
	}



}
