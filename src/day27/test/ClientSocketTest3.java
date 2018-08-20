package day27.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//登录
public class ClientSocketTest3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1", 9912);
		FileInputStream in=(FileInputStream) socket.getInputStream();
		FileOutputStream out=(FileOutputStream) socket.getOutputStream();
		Scanner sc=new Scanner(System.in);
		//接收服务器信息
		byte[]buf=new byte[1024];
		int len;
		while ((len=in.read(buf))!=-1) {
			System.out.println(new String(buf, 0, len));
			//输入
			String str=sc.next();
			out.write(str.getBytes());
			out.flush();
		}
		socket.close();
	}
}
