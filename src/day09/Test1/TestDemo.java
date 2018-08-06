package day09.Test1;

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化cat对象
		Cat cat=new Cat("Tom",2);
		//设置sex
		cat.setSex("公");
		//获取name和age属性
		System.out.println(cat.getName());//子类没有找父类
		System.out.println(cat.getAge());
		System.out.println(cat.getSex());
		//调用公共方法
		cat.doEat();
		//初始化dog对象
		Dog dog=new Dog("ww", 4);
		dog.setWeight(20);
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getWeight());
		dog.doEat();
		dog.swimming();
	}

}
