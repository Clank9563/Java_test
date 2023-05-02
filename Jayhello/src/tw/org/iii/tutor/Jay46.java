package tw.org.iii.tutor;

import java.io.File;

public class Jay46 {

	public static void main(String[] args) {
		File file1 = new File("C://practice/test");//\跳脫字元
		if(file1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
	}

}
