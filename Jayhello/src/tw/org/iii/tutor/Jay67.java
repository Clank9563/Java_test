package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.Socket;

public class Jay67 {

	public static void main(String[] args) {
		try {
			File source = new File("dir1/Jay.jpg");
			BufferedInputStream bin = new BufferedInputStream(
					new FileInputStream(source));
			byte[]buf = new byte[(int)source.length()];
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(//Socket就是TCP
					InetAddress.getByName("10.0.104.202"),9999);
			BufferedOutputStream bout = new BufferedOutputStream(
					socket.getOutputStream());
//			socket.getOutputStream().write(buf);也可以寫這樣
			bout.write(buf);
			bout.flush();
			bout.close();
			socket.close();
			System.out.println("send ok");
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
