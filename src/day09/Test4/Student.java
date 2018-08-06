package day09.Test4;

public class Student {
	//设置属性
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		Student stu=(Student)obj;
		//instanceof用于判断一个引用类型所引用的对象是否是一个类的实例
		if (stu instanceof Student) {
			if(this.age==stu.getAge()&&this.name.equals(stu.getName())&&this.id==stu.getId()){
				return true;
			}
		}
		return false; 
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu1=new Student();
		stu1.setId(1);
		stu1.setName("尊");
		stu1.setAge(21);
		Student stu2=new Student();
		stu2.setId(1);
		stu2.setName("尊");
		stu2.setAge(21);
		if (stu1.equals(stu2)) {
			System.out.println("是同一个人");
		}else {
			System.out.println("不是同一个人");
		}
	}

}
