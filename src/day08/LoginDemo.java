package day08;

/**
 * @author  浪子一秋
 */
//定义一个类login 该类主要功能是演示封装 实现登录
//封装 将类实现细节隐藏，只公开公共调用方法
class Login{
	//属性
	//判断用户名 密码是否合法
	private boolean isOk(String str){
		//length();获取字符串长度
		if (str.length()>=6&&str.length()<=16) {
			return true;
		}
		return false;
	}
	//行为 实现登录功能
	public String login(String userName,String pwd){
		//1.判断用户名是否合法6-16位
		if (!isOk(userName)) {
			return "用户名不合法";
		}
		//2.判断密码是否合法6-16位
		if (!isOk(pwd)) {
			return "请输入合法密码";
		}
		//3.判断是否登录成功
		if (userName.equals("wqeasd")&&pwd.equals("123123")) {
			return "登录成功";
		}
		return "用户名或密码错误";
	}
}
public class LoginDemo {
	/**
	 * 当前类主要作用是调用登录功能
	 */
	public LoginDemo() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化login对象
		Login demo=new Login();
		//调用登录方法  其他所有的登录逻辑都不在此类中进行操作
		String str=demo.login("wqeasd", "123123");
		System.out.print(str);
	}
}
