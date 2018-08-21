package day28.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 监听客户端 发送过来的数据
 * 将数据发送给对应客户端
 */
class ChatService extends Thread{
	private Socket socket;//socket连接对象
	private BufferedWriter bw;//输出流
	private String ip;//当前IP

	public ChatService(Socket socket) {
		this.socket=socket;
		//获取soaket的输出流
		this.ip=socket.getInetAddress().getHostAddress();
		try {
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}	
	}

	@Override
	public void run() {
		//线程体,专门接收
		receiveMsg();
	}
	//处理数据
	private HashMap<String, String> parseContent(String line) {
		//ip地址&content
		//分割字符串&
		//初始化一个HashMap存储字符串
		System.out.println("服务器收到："+line);
		HashMap<String, String>map=new HashMap<String, String>();
		String[]arr=line.split("&");
		if (arr!=null) {
			if (arr.length==2) {
				//存储数据
				map.put("ip", arr[0]);
				map.put("msg", arr[1]);
				//将map保存到文件中				
			}
		}
		System.out.println(map.toString());
		return map;
	}

	//保存数据
	public void saveMsg() {
		
	}
	
	//接收数据
	private void receiveMsg() {
		BufferedReader br=null;
		try {
			//获取socket的输入流对象
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取客户端发来的数据
			String line;
			while ((line=br.readLine())!=null) {
				//处理数据
				HashMap<String, String>map=parseContent(line);
				//转发数据
				OperationChat.getIstance().reSendMsg(map.get("ip"),this.ip+":"+map.get("msg"),this);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//关闭流
			if (br!=null) {
				try {
					br.close();
					this.socket.close();
					//移除
					OperationChat.getIstance().removeChat(this.ip);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//发送数据
	public void sendMsg(String msg) {
		//发送数据
		try {
			this.bw.write(msg);
			//换行
			this.bw.newLine();
			//强制刷入
			this.bw.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

/**
 * 前台
 * 监听连接
 * @throws IOException 
 */
public class ServerSocketDemo {

	public static void main(String[] args) throws IOException {
		// 创建一个ServerSocket对象
		ServerSocket server=new ServerSocket(8080);
		//监听客户端
		Socket client;
		while ((client=server.accept())!=null) {
			//启动线程
			ChatService chat=new ChatService(client);
			chat.start();
			//保存当前线程对象
			chat.sendMsg("已连接服务器");
			String ip=client.getInetAddress().getHostAddress();
			System.out.println("连接到用户"+ip);
			OperationChat.getIstance().addChat(ip, chat);
		}
	}
}

/**
 * 保存所有的服务器端Socket连接对象
 * 数据的转发
 * 单例
 */
class OperationChat{
	//初始化HashMap对象
	HashMap<String, ChatService>map=new HashMap<String, ChatService>();
	//饿汉模型单例
	private static final OperationChat operation=new OperationChat();
	//构造方法私有化
	private OperationChat() {}
	//公开其对象的静态方法
	public static synchronized OperationChat getIstance() {
		return operation;
	}
	//添加map的key=ip地址,value=对象
	public void addChat(String adr,ChatService chat) {
		map.put(adr, chat);
	}
	//移除map
	public void removeChat(String ip) {
		map.remove(ip);
	}
	//转发操作
	public void reSendMsg(String destIp,String msg,ChatService srcChat) {
		//判断单发还是群发
		if (map.containsKey(destIp)) {
			//通过ip找到要转发的对象
			ChatService chat=map.get(destIp);
			//调用方法
			chat.sendMsg(msg);
			return;
		}
		//群发
		Set<Entry<String, ChatService>>set=map.entrySet();
		//遍历
		for (Entry<String, ChatService> entry : set) {
			//获取对象
			ChatService chat=entry.getValue();
			//判断是否是自己
			if (chat!=srcChat) {
				chat.sendMsg(msg);
			}
		}
	}
}
