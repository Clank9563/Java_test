package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Jay69 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com.tw");
			HttpURLConnection conn =
					(HttpURLConnection)url.openConnection();
			conn.connect();
			
			InputStreamReader ireader = new InputStreamReader(conn.getInputStream());
			BufferedReader reader = new BufferedReader(ireader);
			
//			BufferedReader reader = new BufferedReader(
//					new InputStreamReader(conn.getInputStream()));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
			
			
			System.out.println("OK1");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
