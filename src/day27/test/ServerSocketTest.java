package day27.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest  implements Runnable{
	private static Socket socket;
	@Override
	public void run() {
		//初始化键盘录入对象
		Scanner sca=new Scanner(System.in);
		// TODO 自动生成的方法存根
		OutputStream out;
		while (true) {
			try {		
				System.out.println("请输入要返回的服务器的信息：");
				out = socket.getOutputStream();
				//返回信息				
				byte[]b=sca.next().getBytes();
				out.write(b);
				//刷入
				out.flush();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// 创建ServerSocket对象
		ServerSocket server=new ServerSocket(21112);
		//监听客户端
		System.out.println("正在连接。。。。");
		socket=server.accept();
		System.out.println("已连接！");
		//启动线程
		ServerSocketTest test=new ServerSocketTest();
		Thread th=new Thread(test);
		th.start();
		InputStream in=socket.getInputStream();
		//接收客户端信息
		byte[]buf=new byte[1024];
		int len;
		while ((len=in.read(buf))!=-1) {
			System.out.println("客户端信息：");
			System.out.println(new String(buf, 0, len));
			System.out.println("请回复：");
		}
		//关闭服务器
		socket.close();
		server.close();
	}
}
