package day12.Test1;

public class Circle implements GetAreaInterface{
	// 半径
	private double r;	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle() {
		// TODO 自动生成的构造函数存根
	}
	public  Circle(double r) {
		this.setR(r);
	}
	@Override
	public double getArea() {		
		//求面积
		double area=3.14*Math.pow(this.r, 2);
		return area;
	}
}
