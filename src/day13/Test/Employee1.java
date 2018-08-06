package day13.Test;

class WeekDay{
	//该类是个常量类
	public static final int MON=1;
	public static final int TUES=2;
	public static final int WENDES=3;
	public static final int THURS=4;
	public static final int FRI=5;
	public static final int SATUR=6;
	public static final int SUN=7;
}

public class Employee1 {
	//属性
	private int restday;//休息日

	public int getRestday() {
		return restday;
	}

	public void setRestday(int restday) {
		this.restday = restday;
	}
	//设置方法
	public void restDay() {
		switch (this.getRestday()) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("学习去吧！");
			break;
		case 7:
			System.out.println("休息吧！");
			break;
		default:
			System.out.println("请输入1-7");
			break;
		}
	}
	public static void main(String[] args) {
		//初始化一个对象
		Employee1 em1=new Employee1();
		//给属性赋值,提高代码的可阅读性
		em1.setRestday(WeekDay.THURS);
		//判断日期是否是休息日
		em1.restDay();
	}
}
