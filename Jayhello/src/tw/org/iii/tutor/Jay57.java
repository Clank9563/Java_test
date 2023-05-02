package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Jay57 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("dir1/Guess_Number_icon.jpg");
		File target = new File("dir1/brad3.jpg");
		try {
			FileInputStream fin = new FileInputStream(source);
			byte[]buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(target);
			fout.write(buf);
			fout.flush();//確保資料有送出去
			fout.close();
			System.out.println("finish2:"+(System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
