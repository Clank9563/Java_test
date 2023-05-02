package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Jay54 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/file1.txt");
			////FileReader只適用文字資料FileInputStream適合全部但要自己轉檔
			int c;
			while((c = reader.read()) !=-1) {
				System.out.print((char)c);
			}
			reader.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
