package day13.dao.implement;

import day13.dao.UserInterface;

public class UserImplement implements UserInterface{
	//所有用户功能的实现  操作数据库
	@Override
	public void register(String name, String psw) {
		// 注册功能的实现
		
	}
	@Override
	public boolean login(String name, String psw) {		
		// 登录功能的实现
		return false;
	}
	@Override
	public boolean rePassword(String name, String oldPwd, String newPwd) {
		// 修改密码
		return false;
	}
	@Override
	public boolean editPersonInfo(String uid, String nickName) {
		//编辑个人中心
		return false;
	}
}
