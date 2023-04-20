package tw.org.iii.tutor;

import tw.org.iii.myclasses.Scooter;

public class Jay20 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.changeGear(2);
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		s1.downspeed();
		System.out.println(s1.getSpeed());
	}

}
