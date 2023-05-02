package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jay50 {

	public static void main(String[] args) {
		try {
			int c;
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			
			
			
//			System.out.println(c);//ASCII
			fin.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
