package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Jay55 {

	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir1/Jay.jpg");//圖片貼到這裡
			FileInputStream fin = new FileInputStream("dir1/Guess_Number_icon.jpg");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish:"+(System.currentTimeMillis()-start));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
