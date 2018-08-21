package day28.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

class ReceivedMsg extends Thread{
	private DatagramSocket receiveSocket;
	public ReceivedMsg() {
		// TODO 自动生成的构造函数存根
	}
	public ReceivedMsg(DatagramSocket receiveSocket) {
		this.receiveSocket=receiveSocket;
	}
	@Override
	public void run() {		
		try {
			//创建一个接收的packet对象
			byte[]buf=new byte[1024];
			DatagramPacket receivePacket=new DatagramPacket(buf, buf.length);
			while (buf.length!=0) {
				receivePacket.setData(buf, 0, receivePacket.getLength());
				//接收数据
				receiveSocket.receive(receivePacket);
				//处理数据
				System.out.println("接收到的数据是："+new String(receivePacket.getData(),0,receivePacket.getLength()));
				System.out.println("IP:"+receivePacket.getAddress().getHostAddress()+"\tPort:"+receivePacket.getPort());
				//保存Ip
				ArrayList<String>list=new ArrayList<String>();
				list.add(receivePacket.getAddress().getHostAddress());
				for (String string : list) {
					//System.out.println(string);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭socket
			receiveSocket.close();
		}
	}
}

public class SendMsgDemo {

	public static void main(String[] args) throws IOException {
		//创建socket对象
		DatagramSocket receiveSocket=new DatagramSocket(10004);
		DatagramSocket sendSocket=new DatagramSocket();
		//初始化输出流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;	
		while ((line=br.readLine())!=null) {
			//启动线程
			ReceivedMsg receive=new ReceivedMsg(receiveSocket);
			receive.start();
			//构建报文
			byte[]buf=line.getBytes();
			DatagramPacket packet=new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.01"),10004);
			//发送报文
			sendSocket.send(packet);
		}	
		sendSocket.close();
	}
}
