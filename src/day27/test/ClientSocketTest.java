package day27.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocketTest implements Runnable{
	private static Socket socket;
	@Override
	public void run() {
		OutputStream out;
		
		//初始化键盘录入对象
		Scanner sca=new Scanner(System.in);
		while (true) {
			try {
				System.out.println("请输入要发送的客户端的信息：");
				out = socket.getOutputStream();			
				byte[]b=sca.next().getBytes();
				//发送数据
				out.write(b);
				//刷入
				out.flush();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建Socket对象
		socket=new Socket("127.0.0.1", 21112);
		InputStream in=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		//启动线程
		ClientSocketTest test=new ClientSocketTest();
		Thread th=new Thread(test);
		th.start();
		//接收数据
		//byte[]buf=new byte[1024];
		String line;
		while ((line=br.readLine())!=null) {			
			System.out.println("客户端1信息：");
			System.out.println(line);	
			System.out.println("请回复：");
		}
		//关闭连接
		socket.close();
	}
}
