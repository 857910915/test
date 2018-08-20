package day27.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//上传文件
public class ServerSocketTest2 {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(11221);
		System.out.println("等待连接。。。。");
		Socket socket=server.accept();
		System.out.println("已连接！");
		//上传文件
		FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\day02\\FirstDemo.java");
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		byte []buf=new byte[1024];
		int len=0;
		System.out.println("发送到客户端。。。");
		while ((len=in.read(buf))!=-1) {
			String str=new String(buf, 0,len);
			System.out.println(str);
			out.write(str.getBytes());
			out.flush();
		}
		socket.close();
		server.close();
	}
}
