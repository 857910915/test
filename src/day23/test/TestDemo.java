package day23.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\个人总结\\Java学习第22天\\pet. template");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\个人总结\\Java学习第22天\\pet. txt");
		BufferedWriter bw=new BufferedWriter(fw);
		//读取文件
		//System.out.println(br.markSupported());
		String str=br.readLine();
		//写文件
		bw.write(str);
		//刷入
		bw.flush();
		//关闭
		bw.close();
		br.close();
		
	}
}
