package day23.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedCopyTest1 {

	public static void main(String[] args) throws IOException {
		// 创建对象，关联对象
		InputStreamReader in=new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\day04\\123.txt"), "GBK");
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\123.txt"), "GBK");
		BufferedReader br=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		//读取文件
		while (br.ready()) {
			String str=new String(br.readLine());
			//写入
			bw.write(str);
			//换行
			bw.newLine();
		}
		//强制刷入
		bw.flush();
		//关闭流
		bw.close();
		out.close();
		br.close();
		in.close();
		
		
		
	}

}
