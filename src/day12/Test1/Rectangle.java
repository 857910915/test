package day12.Test1;
//长方形
public class Rectangle implements GetAreaInterface{
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public Rectangle() {
		// TODO 自动生成的构造函数存根
	}
	public  Rectangle(double length,double width) {
		this.setLength(length);
		this.setWidth(width);
	}
	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		double area=this.getLength()*this.getWidth();
		return area;
	}
}
