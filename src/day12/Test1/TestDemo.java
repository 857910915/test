package day12.Test1;

public class TestDemo {
	public static void getAreas(GetAreaInterface face) {
		if (face instanceof Circle) {
			System.out.println("圆的面积是"+face.getArea());
		}else if (face instanceof Rectangle) {
			System.out.println("长方形的面积是"+face.getArea());
		}		
	}
	public static void main(String[] args) {
		// 初始化对象  调用方法
		Circle circle=new Circle(2);
		getAreas(circle);
		Rectangle rect=new Rectangle(2,3);
		getAreas(rect);
	}

}
