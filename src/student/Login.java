package student;

public class Login {
	public boolean login(String username,String pwd) {
		//验证账号密码
		if (username.equals("qq")&&pwd.equals("123123")) {
			return true;
		}
		return false;	
	}	
}
