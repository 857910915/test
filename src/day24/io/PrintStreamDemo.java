package day24.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream 打印输出流
 * 可以输出字节流，可以向不同的流中输出数据，自带换行符
 * 如果输入烦人是字符，使用PrintWriter，带编码格式
 * */
public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// 初始化对象
		PrintStream st=new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\p1.txt"),false);
		//写入数据
		//不带换行
		st.print(true);
		st.print(111);
		st.print(12.3F);
		st.print("qq1");
		//自带换行功能
		st.println(false);
		st.println("nihao");
		st.println("Hello");
		st.println(123);
		//关闭
		st.close();
	}

}
