package day28.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Send1 implements Runnable
{
	private DatagramSocket ds;
	public Send1(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		try
		{
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=bufr.readLine())!=null)
			{	
				byte[] buf = line.getBytes();
				DatagramPacket dp =new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10002);
				ds.send(dp);
				if("886".equals(line))
					break;
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("发送端失败");
		}
	}
}

class Rece1 implements Runnable
{
	private DatagramSocket ds;
	public Rece1(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf,buf.length);
				ds.receive(dp);

				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(),0,dp.getLength());
				if("886".equals(data))
				{
					System.out.println(ip+"....离开聊天室");
					break;
				}
				System.out.println(ip+":"+data);
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("接收端失败");
		}
	}
}

public class  ChatDemo1
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receSocket = new DatagramSocket(10003);

		new Thread(new Send1(sendSocket)).start();
		new Thread(new Rece1(receSocket)).start();
	}
}
