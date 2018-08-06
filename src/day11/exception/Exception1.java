package day11.exception;

public class Exception1 {
/**
 * 捕获异常
 * try{
 * 		//有可能出现异常的代码
 * }catch(Exception e){//catch语句可以有多个
 * 		//捕获异常
 * }finallt{
 * 	//无论有无异常，都要执行
 * }
 * try不能单独使用
 * catch捕获多个异常的时候
 * 		先子类异常，再父类异常
 * */
	public static void main(String[] args) {
		// 声明两个变量
		int num=1;
		int num1=0;
		int[]arr=new int[1];
		//try--catch结合使用
		try {//存放有可能出现异常的代码
			//如果出现异常，没有对异常进行处理，以下代码将不会执行		
		System.out.println(num/num1);
		} catch (Exception e) {//捕获异常，对异常进行处理，保证程序继续运行
			// 处理异常
			System.out.println(e.getMessage());
			//打印输出所有的异常印象
			e.printStackTrace();
		}
		//try--finally结合使用
		try {
			arr[0]=1;
			//arr[1]=2;
		} finally {
			// 无论有无异常，该代码块都会执行，如果没有catch语句，执行完该代码块，程序中断
			System.out.println("一定执行");
		}
		//try--catch--finally结合使用
		try {
			System.out.println(num/num1);//算术异常
			System.out.println(arr[1]);//数组下标越界
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("最终执行的代码块");
		}
		System.out.println("Hello Exception!");
	}

}
