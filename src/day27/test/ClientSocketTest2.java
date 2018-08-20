package day27.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//接收文件
public class ClientSocketTest2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1", 11221);		
		FileInputStream in=(FileInputStream) socket.getInputStream();
		FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\FirstDemo.java");
		//接收文件
		byte[]buf=new byte[1024];
		int len=0;
		while ((len=in.read(buf))!=-1) {
			String str=new String(buf, 0, len);
			System.out.println(str);
			out.write(str.getBytes());
			out.flush();
		}
		socket.close();	
	}
}
