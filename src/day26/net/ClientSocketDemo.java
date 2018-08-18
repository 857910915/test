package day26.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * 客户端socket
 * 		1.连接服务器socket对象
 * 		2.发送数据给服务器
 * 		3.接收服务器返回的数据
 * */
public class ClientSocketDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1.创建客户端socket对象，指定要连接的服务器端口号和主机地址，自动连接服务器
		Socket client=new Socket("127.0.0.1", 9999);
		//2.给服务器发送数据 写操作，输出流
		FileOutputStream out=(FileOutputStream) client.getOutputStream();
		//发送数据
		out.write("Hello ServerSocket!".getBytes());
		//刷入
		out.flush();
		//关闭流
		out.close();
		//关闭socket
		client.close();
	}
}
