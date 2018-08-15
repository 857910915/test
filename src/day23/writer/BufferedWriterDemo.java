package day23.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * BufferedWriter是Writer的子类
 * 		可以写入一行数据，可以换行
 * */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// 创建BufferedWriter对象
		//创建一个Writer子类对象
		//可以设置编码集
		//OutputStreamWriter osw=new OutputStreamWriter(out, enc);
		//默认编码集
		FileWriter writer=new FileWriter("C:\\Users\\Administrator\\Desktop\\222.txt",true);
		BufferedWriter bw=new BufferedWriter(writer);
		//写数据
		String str="哎呦，不错哦！";
		bw.write(str);
		//换行
		bw.newLine();
		//刷入
		bw.flush();
		//关闭流
		writer.close();
		bw.close();
	}

}
