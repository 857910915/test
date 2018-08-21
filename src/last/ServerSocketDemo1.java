package last;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

class OperationMsg extends Thread{
	private Socket client;
	private HashMap<String, Socket>map;

	public OperationMsg(Socket client,HashMap<String, Socket>map) {
		this.client=client;
		this.map=map;
	}
	@Override
	public void run() {
		// 读取信息
		try {			
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));		
			String line;
			while ((line=br.readLine())!=null) {
				//遍历
				Set<String>keys=map.keySet();
				for (String string : keys) {
					if (string.equals("192.168.4.131")) {
						System.out.println(client.getInetAddress().getHostAddress());
						BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
						bw.write(line);
						bw.newLine();
						bw.flush();
					}
				}
			}
			client.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

public class ServerSocketDemo1 {

	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象
		ServerSocket server=new ServerSocket(12123);
		//监听客户端
		Socket client;
		while ((client=server.accept())!=null) {
			//启动线程
			System.out.println(client.getInetAddress().getHostAddress());
			HashMap<String, Socket>map=new HashMap<String, Socket>();
			map.put(client.getInetAddress().getHostAddress(), client);
			new Thread(new OperationMsg(client,map)).start();		
		}
		server.close();
	}
}
