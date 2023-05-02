package tw.org.iii.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Jay62 {

	public static void main(String[] args) {//2^16通訊阜0~65535
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for(InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
				
			}
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}

}
