package day11.exception;

public class Exception2 {
/**
 * try--catch--finally语句
 * 		如果使用return语句，必须先执行完finally语句，再执行return语句
 * 		System.exit(0);语句可以终止finally语句
 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			int a=10;
			int b=0;
			System.out.println("a/b="+a/b);
			//return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获异常");
			System.exit(0);//终止虚拟机
			//return;
		}finally {
			//return;//不可达代码
			System.out.println("最终执行");
		}
		System.out.println("所有操作执行完毕");
	}

}
