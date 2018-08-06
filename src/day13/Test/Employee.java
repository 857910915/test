package day13.Test;

public class Employee {
	//属性
	private int restday;//某一天休息
	
	public int getRestday() {
		return restday;
	}

	public void setRestday(int restday) {
		this.restday = restday;
	}
	//判断某一天是否是休息日
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
		//初始化员工对象
		Employee em=new Employee();
		//设置日期
		em.setRestday(12);
		//判断
		em.restDay();
	}
}
