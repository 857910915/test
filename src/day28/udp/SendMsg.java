package day28.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * UDP是一个不可靠的连接协议
 * 数据发送都是以报文进行发送的
 * */
public class SendMsg {

	public static void main(String[] args) throws IOException {
		// 1.创建socket对象
		DatagramSocket socket=new DatagramSocket(9098);
		//2.创建要发送的报文，报文：地址和数据
		String msg="Hello Java!";
		//构建报文
		byte[]buf=msg.getBytes();
		DatagramPacket packet=new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"),9099);
		//3.发送报文
		socket.send(packet);
		//4.设置包的长度
		buf=new byte[1024];
		packet.setData(buf, 0, buf.length);
		//接收数据
		socket.receive(packet);
		//处理数据
		System.out.println("接收到的数据是："+new String(packet.getData(),0,packet.getLength()));
		System.out.println("IP:"+packet.getAddress().getHostAddress()+"\tPort:"+packet.getPort());
		//4.关闭socket
		socket.close();
	}

}
