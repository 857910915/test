package day10;

public class Master {
	/*	//给狗看病
	public void cure(Dog dog) {
		dog.toHospital();		
	}
	//给企鹅看病
	public void cure(Penguin pen) {
		pen.toHospital();
	}
	*/
	//给所有宠物看病
	public void cure(Pet p) {
		//子类的对象，父类的引用
		System.out.println("p=="+p);
		//调用去医院方法
		p.toHospital();
	}
	public static void main(String[] args) {
		//初始化一个master对象
		Master m=new Master();
		//初始化dog对象,将dog对象赋值给宠物类型(父类
		Dog dog=new Dog(40);
		System.out.println(dog);
		Pet p=dog;
		System.out.println(p);
		//给宠物看病
		m.cure(p);
		//同上
		Penguin pen=new Penguin(20);
		System.out.println(pen);
		Pet p1=pen;//将子类的对象赋值给父类的引用
		System.out.println(p1);
		m.cure(p1);
		/**
		 * 多态
		 * 		1.将子类的对象赋值给父类的引用
		 * 		2.当用父类引用调用父类的方法时，执行的是子类重写的方法
		 * 		3.如果使用方法 必须有继承关系
		 * */	
		//再加个小猫类;
		Cat cat=new Cat();
		System.out.println(cat);
		Pet p2=cat;
		System.out.println(p2);
		m.cure(p2);
	}
}
