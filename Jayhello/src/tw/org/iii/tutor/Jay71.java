package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Jay71 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

//			InputStreamReader ireader = new InputStreamReader(conn.getInputStream());
//			BufferedReader reader = new BufferedReader(ireader);

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer sb = new StringBuffer();
			
			while ((line = reader.readLine()) != null) {
				
				sb.append(line);
			}
			
			reader.close();
			System.out.println("OK");
			parseJSON(sb.toString());

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// parse JSON
	static void parseJSON(String json) {
		JSONArray root = new JSONArray(json);
//		System.out.println(root.length());
		for (int i = 0; i < root.length(); i++) {
			JSONObject row=root.getJSONObject(i);
			System.out.println(row.getString("Name"));
			System.out.println(row.getString("City"));
		}
		{
		}
	}

}
