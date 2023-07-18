package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Jay68 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket= server.accept();
			BufferedInputStream bin= new BufferedInputStream(
					socket.getInputStream());
			byte[]buf = new byte[1024*1024];
			int len;
			String hostname = socket.getInetAddress().getHostAddress();
//			SimpleDateFormat sdf= new SimpleDateFormat("mm_ss");
			BufferedOutputStream bout = new BufferedOutputStream(
					new FileOutputStream(String.format(
					"dir2/%s.jpg", socket.getInetAddress().getHostAddress())));
			
			while((len = bin.read(buf))!= -1) {
			bout.write(buf,0,len);	
			}
			
			
			bin.close();
			socket.close();
			server.close();
			System.out.println("Receive ok:"+hostname);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
