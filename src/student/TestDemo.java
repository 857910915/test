package student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		//读取数据
		StudentInfo info=new StudentInfo();
		ArrayList<HashMap<String, String>>list=info.readInfo();
		//登录
		System.out.println("请输入账号：");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		System.out.println("请输入密码：");
		String pwd=sc.next();
		Login login=new Login();

		while (login.login(username, pwd)) {
			// 初始化对象
			Operation operation=new Operation();
			System.out.println("请输入指令！");
			int code=sc.nextInt();
			//添加学生信息
			if (code==1) {
				HashMap<String, String>stu=new HashMap<String, String>();
				System.out.print("请输入学员的ID ");
				stu.put("id",sc.next());
				System.out.print("请输入学员的姓名 ");
				stu.put("name",sc.next());
				System.out.print("请输入学员的年龄 ");
				stu.put("age",sc.next());
				System.out.print("请输入学员的性别 ");
				stu.put("sex",sc.next());
				System.out.print("请输入学员的成绩");
				stu.put("score",sc.next());
				operation.addStudent(list, stu);
			}else if (code==2) {
				//删除学生信息

			}else if (code==3) {
				//查询学生信息
			}else if (code==4) {
				//修改学生信息
			}else if(code==5){
				//查询所有学员信息
				operation.listAllInfo(list);
			}else if (code==0) {
				//保存退出
				info.saveInfo(list);
				System.out.println("欢迎下次使用！");
				System.exit(0);
			}else {
				System.out.println("请输入正确的指令！");
			}
		}
		System.out.println("用户名或者密码错误！");

	}



}
