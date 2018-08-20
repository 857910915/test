package day27.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest1 {

	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		ServerSocket server=new ServerSocket(12123);
		//监听客户端
		System.out.println("等待链接。。。。");
		Socket socket=server.accept();
		System.out.println("已连接！");
		//字符流
		FileInputStream in=(FileInputStream) socket.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(reader);
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		OutputStreamWriter writer=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(writer);
		//读取数据
		//char[]c=new char[100];
		while (br.ready()) {
			System.out.println(br.readLine());
			bw.write("欢迎下次连接，再见！");
			bw.flush();
		}
		//关闭连接
		socket.close();
		server.close();
	}
}
