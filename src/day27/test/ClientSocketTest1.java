package day27.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建Socket对象
		Socket socket=new Socket("127.0.0.1", 12123);
		//字符流
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		OutputStreamWriter writer=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(writer);
		FileInputStream in=(FileInputStream) socket.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(reader);
		//发送数据
		bw.write("你好服务器！");
		bw.flush();
		//接收数据
		//char[]c=new char[100];
		while (br.ready()) {
			System.out.println(br.readLine());
		}
		//关闭连接
		socket.close();
	}
}
