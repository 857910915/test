package day08;
/**
 * JavaBean 是一种JAVA语言写成的可重用组件(类).
 * 1):类必须使用public修饰.
 * 2):必须保证有公共无参数构造器,即使手动提供了带参数的构造器,也得提供无参数构造器..
 * 3):包含了属性的操作手段(给属性赋值,获取属性值).
 * */
public class UserBean {
	//字段
	private String name;
	private int age;
	private boolean sex;
	//公开方法
	//getter方法:   仅仅用于获取某一个字段存储的值.
	//去掉get,把首字母小写,得到name1.此时name1才是属性.	
	public String getName() {
		return name;
	}
	//setter方法:  仅仅用于给某一个字段设置需要存储的值.
	public void setName(String name1) {
		//this主要存在于两个位置:
        //构造器中:  就表示当前创建的对象.
        //方法中:  哪一个对象调用this所在的方法,那么此时this就表示哪一个对象.
		this.name = name1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age1) {
		this.age = age1;
	}
    //如果操作的字段是boolean类型的,此时不应该叫做getter方法,
	//而是is方法,把 getName 变成 isName.
	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	//默认构造方法
}

