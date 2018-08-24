package day30.reflect;

//通过反射获取字段
public class ReflectDemo3 {
	public static String msg;
	public int age;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		System.out.println(this.name+"\t"+this.age+"\t"+this.msg);
		return super.toString();
	}
}
