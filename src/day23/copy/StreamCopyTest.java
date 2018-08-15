package day23.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamCopyTest {

	public static void main(String[] args) throws IOException {
		// 初始化输入输出对象
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\day01\\FirstDemo.java");
		InputStreamReader reader=new InputStreamReader(in);
		FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\FirstDemo.java");
		OutputStreamWriter writer=new OutputStreamWriter(out);
		//读取文件
		char[]cbuf=new char[10];
		int len=0;
		//持续读取文件
		while ((len=reader.read(cbuf))!=-1) {			
			String str=new String(cbuf, 0, len);
			//读取多少，写多少
			writer.write(str);
		}
		//刷入
		writer.flush();
		//关闭
		writer.close();
		in.close();
		reader.close();
		out.close();
	}

}
