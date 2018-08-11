package day17.test;

import java.util.Arrays;

public class Coach {
	//属性
	private Integer[]players=new Integer[5];
	//添加号码
	public void addNumber(int num) {
		//保存数据
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
	//通过下标查找
	public Integer seachByIndex(int index) {
		return players[index];		
	}
	//通过元素查找
	public int seachByNumber(int numbe) {
		//遍历数组
		int index=0;
		for (Integer integer : players) {
			if (integer!=null) {
				if (integer==numbe) {
					return index;
				}
			}
			index++;
		}
		return -1;		
	}
	//替换  通过下标
	public void replacePlayerByIndex(int index,Integer number) {
		players[index]=number;
	}
	//替换 通过元素
	public void replacePlayersByNumber(int num,int number) {
		for (int i = 0; i < players.length; i++) {
			Integer integer = players[i];
			if (integer==num) {
				players[i]=number;
			}
		}
	}

	//删除
	public void deletePlayers(int index) {
		for (int i =index; i < players.length; i++) {
			 if(index<=i&&i<players.length-1){
				//将后边的元素往前边来放
				 players[i]=players[i+1]; 
			 }
		 }
		players =Arrays.copyOf(players, players.length-1);		
	}
	//转换
	public void transformat() {
		System.out.print("[");
		for (int i = 0; i < players.length; i++) {
			Integer integer = players[i];
			if (integer!=null) {
				System.out.print(integer+" ");
			}			
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// 初始化对象
		Coach coach=new Coach();
		//添加
		coach.addNumber(11);
		coach.addNumber(22);
		coach.addNumber(33);
		coach.addNumber(44);
		coach.addNumber(55);
		coach.transformat();
		System.out.println("------查找--------");
		System.out.println(coach.seachByIndex(1));
		System.out.println(coach.seachByNumber(22));
		System.out.println("------替换-------");
		coach.replacePlayerByIndex(2, 333);
		coach.replacePlayersByNumber(22, 222);
		coach.transformat();
		System.out.println("------删除后-----");
		coach.deletePlayers(2);
		coach.transformat();
	}

}
