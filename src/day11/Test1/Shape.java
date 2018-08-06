package day11.Test1;
//父类
public abstract class Shape {
	//属性
	private double area;
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	//求面积
	public abstract double getAears();
}
