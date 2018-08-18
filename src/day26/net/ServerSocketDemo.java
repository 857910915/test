package day26.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端 socket
 * 		1.监听所有客户端连接
 * 		2.接收所有客户端发送来的数据
 * 		3.发送给客户端数据
 * */
public class ServerSocketDemo {

	public static void main(String[] args) throws IOException {
		// 1.创建一个ServerSock对象，并绑定本机的端口号
		ServerSocket server=new ServerSocket(9999);
		//2.阻塞监听客户端连接的对象  端点
		System.out.println("等待客户端连接。。。");
		Socket socket=server.accept();
		System.out.println("客户端连接");
		//3.接收客户端发送来的数据 读取数据
		FileInputStream in=(FileInputStream)socket.getInputStream();
		//创建一个缓冲数组
		byte[]buf=new byte[1024];
		int len=0;
		while ((len=in.read(buf))!=-1) {
			//处理数据
			String str=new String(buf,0,len);
			System.out.println("接收到的数据："+str);
		}
		//4.关闭流
		in.close();
		//5.关闭socket
		socket.close();				
	}
}
