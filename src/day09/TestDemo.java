package day09;
//测试类
public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化一个Student对象 给对象赋值
		Student stu=new Student();
		stu.sid="001";
		stu.name="熊大";
		stu.age=22;
		//stu.tel=112233;//父类的私有成员不能被访问
		stu.sleep();
	    System.out.println(stu.sid);
		//初始化一个Teacher对象 给对象赋值
	    Teacher tea=new Teacher();
	    tea.name="熊二";
	    tea.age=21;
	    tea.level=3;
	    tea.sleep();
	    System.out.println(tea.level);
	  //初始化一个Employeer对象 给对象赋值
	    Employee em=new Employee();
	    em.name="熊三";
	    em.age=19;
	    em.hirDete="2018";
	    em.sleep();
	    em.method1();
	    System.out.println(em.hirDete);
	}

}
