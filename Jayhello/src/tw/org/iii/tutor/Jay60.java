package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.myclasses.Student;

public class Jay60 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream
					(new FileInputStream("dir1/s1"));
			Object obj = oin.readObject();
			if(obj instanceof Student) {
//				System.out.println("yes");
				Student s2 = (Student)obj;//
				System.out.println(s2.sum()+":"+s2.avg());
			}else {
				System.out.println("NO");
				
			}
			
			Object obj2 = oin.readObject();
			if(obj2 instanceof Student) {
//				System.out.println("yes");
				Student s2 = (Student)obj2;//
				System.out.println(s2.sum()+":"+s2.avg());
			}else {
				System.out.println("NO");
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
