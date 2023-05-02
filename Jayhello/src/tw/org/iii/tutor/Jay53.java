package tw.org.iii.tutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Jay53 {

	public static void main(String[] args) {
		String data = "Hello,World\n";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2.txt",true);
			//如果沒有就建立file2.txt
			//("dir1/file2.txt",true); ,boolean append
			fout.write(data.getBytes());//把data轉成byte
			fout.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
