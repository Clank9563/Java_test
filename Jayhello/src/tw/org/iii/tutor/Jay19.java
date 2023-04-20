package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Jay19 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.getSpeed());
		for(int i=0;i<12;i++) {
			bike.upSpeed();			
		}
		System.out.println(bike.getSpeed());
		System.out.println(bike.getcolor());
	}

}
