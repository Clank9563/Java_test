package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Jay24 {
	public static void main(String[] args) {
		String s1 = "Jay";
		String s2 = s1.concat("Chao");
		String s3 = s1.replace('a', 'A');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("----------");

		int a = 10, b = 3;
		System.out.println(a == b);
		String str1 = "Jay";
		String str2 = "Jay";
		System.out.println(str1==str2);
		String str3 = new String("Jay");
		String str4 = new String("Jay");
		System.out.println(str3==str4);//比較記憶體存放位址
		System.out.println("----------");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1==b2);
	}

}
