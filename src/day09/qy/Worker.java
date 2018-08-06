package day09.qy;

import day09.Person;

/**
 * 继承不同包的父类
 * */
public class Worker extends Person{
	public void dowork() {
		//子类是否可以访问父类的private 、default（默认成员）、protected 、public
		//this.tel=21;//私有成员不可直接访问
		//this.name="尊";//默认成员在不同包中也不可访问
		this.address="中国";//protected 修饰的成员可以在不同包的子类中访问
	}
}
