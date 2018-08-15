package day23.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) throws IOException {
		//创建FileWriter和BufferedWriter对象并关联
		FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\个人总结\\Java学习第22天\\111.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		//写操作
		String str="Hello Java!";
		bw.write(str);
		//强制刷入流中的数据到文件中
		bw.flush();
		//关闭流
		bw.close();
		fw.close();
	}
}
