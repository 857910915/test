package day27.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ReceveMsg extends Thread{
	private BufferedReader br;
	public ReceveMsg() {
		// TODO 自动生成的构造函数存根
	}
	public ReceveMsg(BufferedReader br){
		this.br=br;
	}
	@Override
	public void run() {
		// 接收服务器数据	
		try {
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println("<--服务器-->");
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
public class ClientSocketDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1",65432);
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//启动线程
		new ReceveMsg(br).start();
		//发送数据
		Scanner sc=new Scanner(System.in);
		String line;
		System.out.println("客户端发送的信息");
		while ((line=sc.next())!=null) {
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			System.out.println("客户端发送的信息");
		}
		//关闭连接
		socket.close();
	}
}
