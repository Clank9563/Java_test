package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Jay63 {
	public static void main(String[] srgs) {
		//client端UDP
		byte[]data = "你好!!!".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();//可寫到try()裡面，可自動關閉
			DatagramPacket packet = new DatagramPacket(
					data, data.length, InetAddress.getByName("10.0.104.255"//ip設定成255時會全部
							),8888);
			socket.send(packet);
			
			socket.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
