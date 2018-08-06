package day13.Test;
//当前这个类最多只允许有7个对象，每个对象代表一个值
class Weekday2{
	//初始化七个对象，设置为当前类的静态常量
	public static final Weekday2 MON=new Weekday2();
	public static final Weekday2 TUES=new Weekday2();
	public static final Weekday2 WENDES=new Weekday2();
	public static final Weekday2 THURS=new Weekday2();
	public static final Weekday2 FRI=new Weekday2();
	public static final Weekday2 SATUR=new Weekday2();
	public static final Weekday2 SUN=new Weekday2();
	//构造方法私有化,对象只能在本类中实例化
	private Weekday2() {}
}

public class Employee2 {
	//属性
	private Weekday2 restday;

	public Weekday2 getRestday() {
		return restday;
	}

	public void setRestday(Weekday2 restday) {
		this.restday = restday;
	}
	//判断
	public void restDay() {
		if (this.restday==Weekday2.SUN) {
			System.out.println("休息一天");
		}else {
			System.out.println("学习去吧");
		}
	}
	public static void main(String[] args) {
		//初始化员工对象
		Employee2 em2=new Employee2();
		//设置日期,只能是七个对象，增加代码的可阅读性和约束性
		em2.setRestday(Weekday2.FRI);
		//判断
		em2.restDay();
	}
}
