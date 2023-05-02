package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Jay58 {
	public static void main(String[] args) {
		
		try {
//csv
			FileInputStream fin = new FileInputStream("dir1/Fstdata.csv");
			InputStreamReader ir = new InputStreamReader(fin);
			//以上兩列可替換fileReader
			BufferedReader br = new BufferedReader(ir);
			String line;
			while((line = br.readLine()) !=null) {
				String[] row=line.split(",");
				System.out.println(row[1]+":"+row[5]+":"+row[7]);
			}
			
			br.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
