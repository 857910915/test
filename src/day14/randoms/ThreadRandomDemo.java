package day14.randoms;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadRandomDemo {
	public static void main(String[] args) {
		//ThreadRandom 支持多线程
		//获取random，通过当前线程获取一个random对象
		ThreadLocalRandom rand=ThreadLocalRandom.current();
		System.out.println(rand.nextDouble(10.0,20.0));//[10.0,20.0)
		System.out.println(rand.nextInt(10,20));//[10,20)
	}
}
