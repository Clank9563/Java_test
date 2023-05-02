package tw.org.iii.tutor;

import java.io.File;

public class Jay49 {

	public static void main(String[] args) {
		File dir1 = new File("dir1");
		if (dir1.exists() && dir1.isDirectory()) {
			File[] files= dir1.listFiles();
			for(File file:files) {
//				System.out.println(file.getName());//檔案名稱
//				System.out.println(file.getAbsolutePath());//絕對路徑
				String fname = file.getName();
				long size = file.length();
				String type = file.isDirectory()?"dir":"file";
				System.out.println(fname+":"+size+":"+type);
			}
		}
	}

}
