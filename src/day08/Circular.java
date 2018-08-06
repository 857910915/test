package day08;

import java.util.Scanner;

class Point{
	//属性
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
class Distance{
	public void distance(double r) {
		//实例化对象
		Point point =new Point();
		//赋值
		point.setX(-3);
		point.setY(-4);
		//计算两点之间的距离
		double d=Math.sqrt(point.getX()*point.getX()+point.getY()*point.getY());
		//判断点和圆的关系
		if(d>r){
			System.out.println("点在圆外");
		}else if (d==r) {
			System.out.println("点在圆上");
		}else if(d<r){
			System.out.println("点在圆内");
		}
	}
}
public class Circular {
		
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Point point=new Point();
		//初始化键盘录入对象
		Scanner in=new Scanner(System.in);
		System.out.print("r==:");
		double r=in.nextDouble();
		//初始化对象
		Distance dist=new Distance();
		//调用方法进行判断
		dist.distance(r);
	}

}
