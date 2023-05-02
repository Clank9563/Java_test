package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Jay64 {

	public static void main(String[] args) {
		//server端UDP
		 int count=0;
		while(true) {
		byte[]buf = new byte[1024];
		try (DatagramSocket socket = new DatagramSocket(8888);) {
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			byte[]data= packet.getData();
			int len = packet.getLength();
			String mesg = new String(data,0,len);
			
			String urip = packet.getAddress().getHostAddress();
			
			System.out.println(urip+":"+mesg+count++);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}

}
