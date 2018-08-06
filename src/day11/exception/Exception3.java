package day11.exception;

public class Exception3 {
	/**
	 * 声明异常  使用关键字 throws
	 * 语法：修饰符 返回值类型 方法名(参数列表) throws 异常类型1，异常类型2...{
	 *
	 * }
	 * 作用：告诉方法调用者，调用该方法可能会产生的异常类型，调用者需要对异常进行处理
	 * 异常传递链过程中
	 * 		不会创建新的异常信息，会保留原来的异常信息，继续向上传递
	 * */
	//定义方法
	public static void method1() throws Exception{
		//求两个数的商
		int a=10;
		int b=10;
		System.out.println("a/b="+a/b);//可能产生异常，不对该异常进行处理
		//调用method2()
		method2();
	}
	public static void method2() throws ArrayIndexOutOfBoundsException{
		//操作数组
		int[]arr={1};
		System.out.println(arr[2]);//不做处理，只说明，谁调用谁处理
	}
	public static void main(String[] args) {
		//调用者捕获异常信息
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	/*	try {
			method2();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		System.out.println("异常处理完毕");
	}

}
