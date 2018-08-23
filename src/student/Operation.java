package student;

import java.util.ArrayList;
import java.util.HashMap;

public class Operation {
	//添加学生
	public void addStudent(ArrayList<HashMap<String,String>>list,HashMap<String, String>stu) {
		//判断学生是否存在
		if (isExit(list, stu.get("sid"))!=null) {
			System.out.println("该学员已经存在！");
			return;
		}
		//添加信息
		list.add(stu);
		System.out.println("添加成功！");
	}
	//查询单个学生信息
	public void searchBySid(ArrayList<HashMap<String, String>>list,String sid) {
		for (int i = 0; i < list.size(); i++) {
			//通过下标取出学生对象
			HashMap<String, String>stu=list.get(i);
			//取出sid
			String tmpSid=stu.get("sid");
			if (tmpSid.equals(sid)) {
				System.out.println("ID:"+tmpSid+"\tName:"+stu.get("name")+"\tAge:"+stu.get("age")+"\tSex"+stu.get("sex")+"\tScore"+stu.get("score"));
				break;
			}else if(i==list.size()-1){
				System.out.println("该学号不存在");
				return;
			}			
		}
	}
	//查询所有学生信息
	public void listAllInfo(ArrayList<HashMap<String, String>>list) {
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, String>stu=list.get(i);
			System.out.println("ID:"+stu.get("sid")+"\tName:"+stu.get("name")+"\tAge:"+stu.get("age")+"\tSex"+stu.get("sex")+"\tScore"+stu.get("score"));
		}
	}
	//删除学生信息
	public void deleteBySid(ArrayList<HashMap<String, String>>list,String sid) {
		for (int i = 0; i <list.size(); i++) {
			HashMap<String, String>stu=list.get(i);
			//取出sid
			String tmpSid=stu.get("sid");
			if (tmpSid.equals(sid)) {
				//删除信息
				list.remove(i);
				System.out.println("删除成功！");
			}else if(i==list.size()-1){
				System.out.println("该学号不存在");
				return;
			}
		}
	}
	//修改学生信息
	public void editBySid(ArrayList<HashMap<String, String>> list,HashMap<String, String>stu) {
		//判断sid是否存在
		HashMap<String, String>stu1=isExit(list,stu.get("sid") );
		if (stu1!=null) {
			if (stu1.get("name")!=null) {
				stu1.put("name",stu1.get("name"));
			}
			if (stu1.get("age")!=null) {
				stu1.put("age",stu1.get("age"));
			}
			if (stu1.get("sex")!=null) {
				stu1.put("sex",stu1.get("sex"));
			}
			if (stu1.get("score")!=null) {
				stu1.put("score",stu1.get("score"));
			}
			System.out.println("修改成功");
		}else {
			System.out.println("该学号不存在！");
		}
	}

	//判断学生是否存在
	public HashMap<String, String> isExit(ArrayList<HashMap<String, String>>list,String sid) {
		//声明一个变量
		HashMap<String, String>stu=null;
		//遍历数组
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, String>stu1=list.get(i);
			String tmpId=stu1.get("sid");
			if (tmpId.equals(sid)) {
				stu=stu1;
				break;
			}		
		}
		return stu;		
	}
}
