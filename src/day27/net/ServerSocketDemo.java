package day27.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ReceveClientMsg extends Thread{
	private BufferedReader br;
	public ReceveClientMsg() {
		// TODO 自动生成的构造函数存根
	}
	public ReceveClientMsg(BufferedReader br) {
		this.br=br;
	}
	@Override
	public void run() {
		// 接收客户端数据
		try {
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println("<--客户端-->");
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
public class ServerSocketDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(12345);
		System.out.println("等待连接。。。。");
		Socket socket=server.accept();
		System.out.println("连接成功！");
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//启动线程
		new ReceveClientMsg(br).start();
		//向客户端发送数据
		Scanner sc=new Scanner(System.in);
		String line;
		System.out.println("服务器发送的信息");
		while ((line=sc.next())!=null) {
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			System.out.println("服务器发送的信息");
		}
		//关闭连接
		socket.close();
		server.close();
	}
}
