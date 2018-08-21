package day28.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMsg {

	public static void main(String[] args) throws IOException {
		//1.创建socket对象，指定端口号
		DatagramSocket socket=new DatagramSocket(33311);
		//2.创建一个可以接收的package对象
		byte[]buf=new byte[1024];
		DatagramPacket p=new DatagramPacket(buf, 1024);
		//3.接收数据
		socket.receive(p);
		//处理数据
		System.out.println(new String(buf, 0, p.getLength()));
		//获取发送端的ip地址
		InetAddress adr=p.getAddress();
		System.out.println("IP:"+adr.getHostAddress()+"\tPort:"+p.getPort());
		//改变内容
		buf="Hello World!".getBytes();
		//发送数据
		p.setData(buf, 0, buf.length);
		socket.send(p);
		//4.关闭socket
		socket.close();
	}
}
