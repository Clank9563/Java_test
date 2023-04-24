package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Jay33 {

	public static void main(String[] args) {
		int a= 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = Integer.parseInt("10");
		Integer e = 10;//auto-boxing
		System.out.println(e);
		
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
//		System.out.println(b1+b2);//物件不能相加
		
		System.out.println(b+e);//b,e=>auto-unboxing
	}

	
}
