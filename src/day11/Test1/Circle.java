package day11.Test1;
//子类
public class Circle extends Shape{
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
	public double getAears() {
		// TODO 自动生成的方法存根
		this.setArea(Math.PI*Math.pow(this.getR(), 2));
		return this.getArea();
	}
}
