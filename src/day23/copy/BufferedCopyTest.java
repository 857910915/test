package day23.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyTest {
	public static void main(String[] args) throws IOException {
		//创建输入输出流，并关联对象
		FileReader reader=new FileReader("C:\\Users\\Administrator\\Desktop\\Java1807\\day08\\test.txt");
		FileWriter writer=new FileWriter("C:\\Users\\Administrator\\Desktop\\Java1807\\test.txt");
		BufferedReader br=new BufferedReader(reader);
		BufferedWriter bw=new BufferedWriter(writer);
		//读取文件
		//char[]cbuf=new char[10];
		while (br.ready()) {
			String str=new String(br.readLine());
			//写操作
			bw.write(str);
			bw.newLine();
		}
		//强制刷入
		bw.flush();
		//关闭
		bw.close();
		writer.close();
		br.close();
		reader.close();
	}
}
