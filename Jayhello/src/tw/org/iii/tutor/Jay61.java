package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jay61 {
	public static void main(String[] args) {
		Jay613 obj = new Jay613();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/brad"));
			oout.writeObject(obj);
			oout.flush(); oout.close();
			System.out.println("----");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/brad"));
			oin.readObject();
			oin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Jay611 implements Serializable {
	Jay611(){System.out.println("Jay611()");}
}
class Jay612 extends Jay611 {
	Jay612(){System.out.println("Jay612()");}
}
class Jay613 extends Jay612 {
	Jay613(){System.out.println("Jay613()");}
}