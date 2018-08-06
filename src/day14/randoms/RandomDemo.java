package day14.randoms;

import java.util.Random;

public class RandomDemo {
	/**
	 * Random 生成一个伪随机数，主要依靠种子
	 * 		类型：boolean  	true  false
	 * 				  double  	[0.0,1.0)
	 * 				  float      		[0.0,1.0)
	 * 				  int          	整数的范围
	 * 				  long       	long的范围
	 * */
	public static void main(String[] args) {
		//初始化一个随机数
		Random rand=new Random();//默认是以当前时间为种子
		//Random rand=new Random(10);//每次生成的数字固定
		//生成随机数据
		System.out.println(rand.nextBoolean());//boolean类型
		System.out.println(rand.nextDouble());//double类型
		System.out.println(rand.nextFloat());//float类型
		System.out.println(rand.nextInt());//int类型
		System.out.println(rand.nextLong());//long类型
		System.out.println(rand.nextInt(10));//[0,10)
		System.out.println(10+rand.nextInt(10));//[10,20)
		System.out.println((int)(rand.nextDouble()*11)+10);
	}
}
