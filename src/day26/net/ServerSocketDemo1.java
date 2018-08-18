package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//接收数据


//服务器
public class ServerSocketDemo1{

	public static void main(String[] args) throws IOException {
		// 创建ServerSocket对象
		ServerSocket server=new ServerSocket(9898);
		//监听客户端
		System.out.println("等待连接。。。。");
		Socket socket=server.accept();
		System.out.println("已连接！");
		//接收数据
		FileInputStream in=(FileInputStream) socket.getInputStream();
		//返回数据
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		//声明缓冲数组
		byte []buf=new byte[1024];
		int len=0;
		while ((len=in.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
			//发送数据
			out.write("谢谢连接！".getBytes());
			//刷入
			out.flush();
		}
		//关闭流
		in.close();		
		//关闭流
		out.close();
		//关闭socket
		socket.close();
	}
}
