package day28.tcp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class ServerSocketDemo extends Thread{
	private static HashMap<InetAddress, Socket>map=new HashMap<InetAddress, Socket>();
	private Socket socket;
	private PrintStream psm;
	public ServerSocketDemo(Socket socket) {
		try {
			psm=new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\info.txt",true),true);

		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		this.socket=socket;
	}
	public static void main(String[] args) throws IOException {
		// 创建server对象
		ServerSocket server=new ServerSocket(43434);		
		//开启线程
		Socket client;
		System.out.println("等待连接。。。");
		while ((client=server.accept())!=null) {
			//获取ip
			InetAddress ip=client.getInetAddress();
			System.out.println(ip+"已连接！");
			//将数据保存到map中
			map.put(ip, client);
			//启动线程
			ServerSocketDemo demo=new ServerSocketDemo(client);
			demo.start();
		}
		server.close();
	}

	@Override
	public void run() {
		//接收数据
		//读取当前客户端信息
		BufferedReader br=null;
		PrintStream ps=null;
		try {
			br=new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			ps=new PrintStream(this.socket.getOutputStream());
			while (br.ready()) {
				//获取该用户的连接地址
				InetAddress ip=InetAddress.getByName(br.readLine());
				//群发
				if ("255.255.255.255".equals(ip.getHostAddress())) {
					ps.println("已连接，请发送信息！");
					Set<InetAddress>set=map.keySet();
					for (InetAddress inetAddress : set) {
						if (inetAddress!=this.socket.getInetAddress()) {
							//发送数据
							sendMsg(br, map.get(inetAddress));
						}
					}
				}else if (map.containsKey(ip)) {
					System.out.println("已连接，请发送信息！");
					sendMsg(br, map.get(ip));
				}else {
					System.out.println("连接失败！");
				}
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if (br!=null) {
					br.close();
				}if (ps!=null) {
					ps.close();
				}if (psm!=null) {
					psm.close();
				}					
				this.socket.close();
				map.remove(this.socket.getInetAddress());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	//发送数据
	private void sendMsg(BufferedReader br,Socket socket) throws IOException {
		String data=getDate();
		PrintStream ps=new PrintStream(socket.getOutputStream());
		String sendIp=this.socket.getInetAddress().getHostAddress();
		String line;
		while ((line=br.readLine())!=null) {
			ps.println(data+"\n"+sendIp+"\n"+line);
			psm.println(getDate()+"\r"+sendIp+"对"+socket.getInetAddress().getHostAddress()+"说："+line);
		}
		ps.close();
	}
	private String getDate() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		return sdf.format(date);
	}
}
