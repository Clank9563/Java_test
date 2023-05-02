package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jay52 {

	public static void main(String[] args) {
		try {
			int c;
			File source = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];//一般讀文字檔不會這樣讀
			fin.read(buf);
			System.out.println(new String(buf));
			

			fin.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
