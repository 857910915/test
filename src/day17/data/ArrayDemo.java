package day17.data;

import java.util.Arrays;

public class ArrayDemo {
	//保存学员信息
	public static void addStudent(Student stu,Student[]arr) {
		//保存数据
		//1.遍历数组
		for (int i = 0; i < arr.length; i++) {
			Student student = arr[i];
			//判断stu是否为空
			if (student==null) {
				arr[i]=stu;
				break;
			}
		}
	}
	//修改学员信息
	public static void editStudent(int index,Student[]arr,String name) {
		//通过下标取出需要修改的学员对象
		Student stu=arr[index];
		//判断stu是否为空
		if (stu!=null) {
			//修改名字
			stu.setName(name);
		}
	}
	//查询学员信息，通过下标
	public static Student searchByIndex(int index,Student []arr) {
		return arr[index];	
	}
	//查询学员信息，通过名字
	public static Student searchByName(String name,Student []arr) {
		//遍历数组中所有对象
		for (Student student : arr) {
			if (student!=null) {
				if (student.getName().equals(name)) {
					return student;
				}
			}
		}
		//没找到
		return null;		
	}
	//查询所有信息
	public static void list(Student[]arr) {
		for (int i = 0; i < arr.length; i++) {
			Student student = arr[i];
			if (student!=null) {
				System.out.println(student.getName()+"\t"+student.getAge());
			}
		}
	}
	//通过下标删除指定学员信息
	public static Student[] deleteByIndex(int index,Student []arr) {
		for (int i = 0; i < arr.length; i++) {
			//判断i>=index
			if (i>=index&&i<arr.length-1){
				arr[i]=arr[i+1];
			}			
		}
		return Arrays.copyOf(arr, arr.length-1);		
	}
	public static void main(String[] args) {
		//声明一个数组
		Student []arr=new Student[10];
		addStudent(new Student("葬剑灬尊",21), arr);
		addStudent(new Student("一叶知秋",21), arr);
		addStudent(new Student("浪子一秋",21), arr);
		addStudent(new Student("剑侠情缘",21), arr);
		//通过下标查找
		System.out.println(searchByIndex(1, arr).getName()+"\t"+searchByIndex(1, arr).getAge());
		//通过名字查找
		System.out.println(searchByName("浪子一秋", arr).getName()+"\t"+searchByName("浪子一秋", arr).getAge());
		//修改信息
		editStudent(3, arr, "君子好逑");
		System.out.println("----------删除前---------");		
		list(arr);
		System.out.println("----------删除后---------");		
		//删除信息
		deleteByIndex(0, arr);
		//查找全部
		list(arr);
	}
}
