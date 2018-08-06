package day10.Test;

public class Master {
	//给所有宠物看病
	public void cure(Pet p) {
		//子类的对象，父类的引用
		System.out.println("p=="+p);
		//调用去医院方法
		p.toHospital();
		//如果子类想要执行自己的特性，需要进行强制类型转换
		//instance 判断对象的类型，保证数据类型转换正确
		//执行子类特有行为  
		//强制转换 父类转子类 下转上 需要使用强制转换符
		if (p instanceof Dog) {
			Dog dog=(Dog)p;
			dog.playDisc();
		}else if (p instanceof Penguin) {
			Penguin p1=(Penguin)p;
			p1.swimming();
		}		
	}
	public static void main(String[] args) {
		//初始化一个master对象
		Master m=new Master();
		//初始化dog对象,将dog对象赋值给宠物类型(父类
		Dog dog=new Dog(40);
		System.out.println(dog);
		Pet p=dog;//下转上
		System.out.println(p);
		//给宠物看病
		m.cure(p);
		//同上
		Penguin pen=new Penguin(20);
		System.out.println(pen);
		Pet p1=pen;//将子类的对象赋值给父类的引用
		System.out.println(p1);
		m.cure(p1);

		Cat cat=new Cat();
		System.out.println(cat);
		Pet p2=cat;
		System.out.println(p2);
		m.cure(p2);
		//抽象类不能直接被实例化
		//Pet p3=new Pet() ;
	}
}
