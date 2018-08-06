package day09.Test2;

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化cat对象
		Cat cat=new Cat("Tom",2);
		//设置sex
		cat.setSex("公");
		cat.doEat();
		cat.upperTree();
		//初始化dog对象
		Dog dog=new Dog("ww", 4);
		dog.setWeight(20);
		dog.doEat();
		dog.swimming();
	}

}
