package day23.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader是Reader的子类
 * 		最大特点就是每次可以读取到一行，一行的定义就是读取到换行符
 * */
public class BuferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//初始化一个对象
		//使用手动设置编码格式
		//InputStreamReader input=new InputStreamReader(in, dec);
		//使用默认的编码个打
		FileReader reader=new FileReader("C:\\Users\\Administrator\\Desktop\\Java1807\\day01\\FirstDemo.java");
		BufferedReader br=new BufferedReader(reader);
		//读取数据
		/*//读取单个字符
		System.out.println(br.read());
		//读取多个字符
		char[]cbuf=new char[5];
		System.out.println(br.read(cbuf));*/
		//读取行
		String str=null;
		while (br.ready()) {
			str=br.readLine();
			System.out.println(str);
		}
		//关闭流
		br.close();
		reader.close();
	}
}
