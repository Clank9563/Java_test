package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Jay25 {

	public static void main(String[] args) {
		String str = "Jay";
		String str1 = "Jay";
		String str2 = "III";
		System.out.println(str1.equals(str));
		System.out.println(str1.equals(str2));
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.equals(b2));//比物件==;比內容equals
		Bike b3 = b2;
		System.out.println(b2.equals(b3));//比物件==;比內容equals
	}

}
