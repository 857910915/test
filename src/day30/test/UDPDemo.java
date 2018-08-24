package day30.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPDemo {

	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket socket=new DatagramSocket(9090);
		//创建要发送的报文
		String msg="Hello Java!";
		//构建报文
		byte[]buf=msg.getBytes();
		DatagramPacket packet=new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"),9091);
		//发送报文
		socket.send(packet);
		//设置包的长度
		packet.setData(buf,0,buf.length);
		socket.receive(packet);
		//处理数据
		System.out.println("接收到的数据："+new String(packet.getData(), 0, packet.getLength()));
		System.out.println("IP:"+packet.getAddress().getHostAddress()+"\tPort:"+packet.getPort());
		socket.close();
	}
}
