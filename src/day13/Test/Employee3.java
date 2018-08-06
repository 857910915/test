package day13.Test;
//定义一个枚举类
enum Weekday3{
	/**
	 * 默认继承java.lang.enum这个类
	 * 使用过程中，只用神秘常量
	 * 多个常量之间用逗号隔开
	 * 常量必须放在第一行
	 * 常量都是引用数据类型 ,都是当前枚举的对象
	 * */
	MON,TUES,WEDES,THURS,FRI,SATUR,SUN;
	//public static final Weekday3 MON=new Weekday3();等价于MON	
	//枚举类内部，可以声明字段、方法、构造方法、内部类，必须放在常量之后
	int age;
	public void method1() {
		System.out.println("写代码");
	}
	//构造方法必须私有化
	private Weekday3() {}
}
public class Employee3 {
	//属性
	private Weekday3 restday;

	public Weekday3 getRestday() {
		return restday;
	}

	public void setRestday(Weekday3 restday) {
		this.restday = restday;
	}
	//判断是否是休息日
	public void restDay() {
		switch (this.restday) {
			case MON:
			case	 TUES:
			case WEDES:
			case THURS:
			case FRI:
			case SATUR:
				System.out.println("天天写代码");
				break;
			case SUN:
				System.out.println("休息一天");
				break;
		}
	}
	public static void main(String[] args) {
		//初始化对象
		Employee3 em3=new Employee3();
		//数组属性的值  枚举
		em3.setRestday(Weekday3.FRI);
		//判断
		em3.restDay();
		//获取枚举对象的名称
		String name=Weekday3.SUN.name();
		System.out.println(name);
		name=Weekday3.FRI.toString();
		System.out.println(name);
		//获取枚举对象  常量的序列号 从0开始
		int index=Weekday3.THURS.ordinal();
		System.out.println(index);
		//获取所有的枚举常量，返回一个数组对象
		Weekday3[]arr=Weekday3.values();
		for(Weekday3 weekday3:arr){
			System.out.println(weekday3);
		}
		//将string类型转换成枚举常量，要去string名称和枚举常量名称一致
		Weekday3 day=Weekday3.valueOf("SUN");
		System.out.println(day);
		System.out.println(day.ordinal());
	}
}
