package day14.regex;

public class RegecDemo {
	/**
	 * 正则表达式：规则表达式
	 * 		目的：处理字符串
	 * 写的技巧：
	 * 		自左向右来写，先写元字符，再写量词，最后写逻辑
	 * */
	public static void main(String[] args) {
		//判断一个字符串是否由纯数字组成
		/**
		 * 数字[0-9]
		 * \d 元字符
		 * +  量词  一次以上
		 * */
		//规则  使用的时候加转义符\
		String reg="\\d{4,6}";
		//匹配
		boolean r="123123".matches(reg);
		System.out.println(r);
		//匹配规则  qq号验证
		//规则
		reg="[1,9]\\d{4,9}";
		//验证
		r="123321".matches(reg);
		System.out.println(r);
		//验证手机号
		//reg="[1]([3]|[5]|[7]|[8])\\d{9}";
		reg="1[3578]\\d{9}";
		r="15937583039".matches(reg);
		System.out.println(r);
		//验证用户名
		reg="[a-zA-Z0-9]\\w{4,14}[a-zA-Z0-9]";
		r="12312_o".matches(reg);
		System.out.println(r);
		//邮箱验证规则	
		reg="\\w+@[a-zA-Z0-9]+\\.(com|cn)";
		r="123@qq.cn".matches(reg);
		System.out.println(r);
	}
}
