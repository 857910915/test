package day19.test;

import java.util.Arrays;

//数组练习

public class ArraysDemo {
	//属性
	private Integer[]players=new Integer[5];
	//添加
	public void addNum(int num) {
		for (int i = 0; i < players.length; i++) {
			Integer integer = players[i];
			if (integer==null) {
				players[i]=num;
				break;
			}else if (i==players.length-1) {
				//扩容
				players=Arrays.copyOf(players, players.length+5);
			}
		}
	}
	//删除 通过下标
	public void deleteByIndex(int index) {
		for (int i = 0; i < players.length; i++) {
			Integer integer = players[i];
			if (i>=index&&i<players.length-1) {
				players[i]=players[i+1];				
			}
		}
		//减容
		players=Arrays.copyOf(players, players.length-1);
	}
	//遍历
	public void list() {
		System.out.print("[");
		for (int i = 0; i < players.length; i++) {
			Integer integer = players[i];
			if (integer!=null) {
				System.out.print(integer+"  ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		//初始化对象
		ArraysDemo demo=new ArraysDemo();
		demo.addNum(12);
		demo.addNum(32);
		demo.addNum(22);
		demo.addNum(322);
		//demo.addNum(212);
		demo.list();
		//删除
		demo.deleteByIndex(2);
		System.out.println("删除------------");
		demo.list();
	}
}
