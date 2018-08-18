package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class ClientSocketDemo1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建Socket对象
		Socket client=new Socket("127.0.0.1",9898);
		//发送数据
		FileOutputStream out=(FileOutputStream) client.getOutputStream();
		out.write("Hello ServerSocket!".getBytes());
		//刷入
		out.flush();
		//关闭流
		out.close();
		//接收数据
		FileInputStream in=(FileInputStream) client.getInputStream();
		//声明缓冲数组
		byte[]buf=new byte[1024];
		int len=0;
		while ((len=in.read(buf))!=-1) {
			System.out.println("服务器返回的数据：");
			System.out.println(new String(buf, 0,len));
		}
		//关闭流
		in.close();
		//关闭连接
		client.close();	
	}
}
