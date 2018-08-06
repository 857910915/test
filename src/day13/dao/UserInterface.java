package day13.dao;
//定义个人中心的功能
public interface UserInterface {
	/**
	 *  注册用户
	 *  
	 * @author  浪子一秋
	 * 
	 * @param	name  用户名
	 * @param psw	密码
	 * 
	 * */
	public void register(String name,String psw);
	/**
	 *  用户登录
	 *  
	 * @author  浪子一秋
	 * 
	 * @param	name 用户名
	 * @param psw 密码
	 * 
	 * return;
	 * */
	public boolean login(String name,String psw);
	/**
	 *  修改密码
	 *  
	 * @author  浪子一秋
	 * 
	 * @param	name 用户名
	 * @param oldPsw 原始密码
	 * @param newPsw 新密码
	 * 
	 * return;
	 * */
	public boolean rePassword(String name,String oldPwd,String newPwd);
	/**
	 *  编辑个人中心
	 *  
	 * @author  浪子一秋
	 * 
	 * @param	uid 个人ID
	 * @param nickName	昵称
	 * 
	 * return;
	 * */
	public boolean editPersonInfo(String uid,String nickName);
	
}
