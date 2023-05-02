package tw.org.iii.tutor;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Jay66 {
	//client端TCP
	public static void main(String[] args) {
		final int port = 9957;
		final String address = "10.0.104.202";
		try {
			Socket socket = new Socket(InetAddress.getByName(
					address), port);
			OutputStream oout=socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("Hello, TCP/IP");
			bw.flush();
			bw.close();
			socket.close();
			System.out.println("send:OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
