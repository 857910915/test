package last;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
				String str=sca.next();
				//发送数据
				bw.write(str);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建Socket对象
		socket=new Socket("192.168.4.116", 8080);
		InputStream in=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		//启动线程
		ClientSocketTest test=new ClientSocketTest();
		Thread th=new Thread(test);
		th.start();
		//接收数据
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
