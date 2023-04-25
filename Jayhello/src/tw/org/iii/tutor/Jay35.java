package tw.org.iii.tutor;

import java.util.HashSet;

import tw.org.iii.myclasses.Bike;

public class Jay35 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Jay");
		set.add(new Bike());
		set.add("1234"); //1234=>auto-boxing
		set.add("Jay");
		set.add("1234"); 
		set.add("Jay");
		System.out.println(set.size());
		System.out.println(set.toString());
		

	}

}
