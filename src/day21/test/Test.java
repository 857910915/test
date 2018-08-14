package day21.test;

import java.util.Date;

@SuppressWarnings("serial")
public  class Test extends Date{
	public static void main(String[] args) {
		new Test().test();
	}
	
	public void test(){
		System.out.println(super.getClass().getSuperclass().getName());
	}
}