package day23.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) throws IOException {
		//创建FileReader和BufferedReader对象,并关联
		FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\Java1807\\day01\\FirstDemo.java");
		BufferedReader br=new BufferedReader(fr);
		//读取
		while (br.ready()) {
			System.out.println(br.readLine());
			
		}
		//关闭
		br.close();
		fr.close();
	}
}
