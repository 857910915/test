package day11.Test1;

import java.text.DecimalFormat;

public class TestDemo {
	public static void main(String[] args) {
		//初始化Circle对象
		Circle c=new Circle(2);
		double area=c.getAears();
		DecimalFormat df = new DecimalFormat("#.00");//保留两位小数
		System.out.println("圆的面积："+df.format(area));
		//初始化rectangle对象
		Rectangle r=new Rectangle(3,4);
		area=r.getAears();
		System.out.println("矩形的面积："+area);
	}

}
