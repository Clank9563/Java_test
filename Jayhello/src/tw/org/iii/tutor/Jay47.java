package tw.org.iii.tutor;

import java.io.File;

public class Jay47 {

	public static void main(String[] args) {
		File root = new File(".");// .這一層..上層
		System.out.println(root.getAbsolutePath());//getAbsolutePath()取得絕對路徑
		File dir1 = new File("./dir1");
		if (dir1.exists()) {
			System.out.println("ok");

		} else {

			System.out.println("xx");
		}
	}

}
