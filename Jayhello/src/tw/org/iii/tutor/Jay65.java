package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Jay65 {

	public static void main(String[] args) {
		//server端TCP
		final int port = 9957;
		try {
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostAddress();
			System.out.println(urip);
			
			InputStream in=socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(ir);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			server.close();
			System.out.println("Sever:OK");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
