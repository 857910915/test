package day27.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//判断账号密码
public class ServerSocketTest3 {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9912);
		System.out.println("等待链接。。。");
		Socket socket=server.accept();
		System.out.println("已连接！");
		FileInputStream in=(FileInputStream) socket.getInputStream();
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		//给客户端发送信息
		out.write("请输入账号：".getBytes());
		//接收客户端信息
		byte[]buf=new byte[1024];
		int len=0;
		while ((len=in.read(buf))!=-1) {
			String str=new String(buf, 0,len);
			if (!str.equals("qq123")) {
				out.write("请输入正确的账号！：".getBytes());
				out.flush();
			}else {
				out.write("请输入密码：".getBytes());
				out.flush();
				while ((len=in.read(buf))!=-1) {
					String str1=new String(buf, 0,len);
					if (!str1.equals("123123")) {
						out.write("请输入正确的密码！：".getBytes());
						out.flush();
					}else {
						out.write("登录成功！：".getBytes());
						out.flush();
					}			
				}	
			}			
		}
		socket.close();
		server.close();
	}
}
