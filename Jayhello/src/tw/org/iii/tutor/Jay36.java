package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class Jay36 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("III");
		set.add("Jay");
		set.add("Eric");
		set.add("Peter");
		set.add("Tony");

		Iterator<String> it = set.iterator();// 捲線器Iterator
		while (it.hasNext()) {// hasNext()有沒有東西在
			System.out.println(it.next());
		}
		System.out.println("---------");
		for(String v:set) {
			System.out.println(v);
		}
		
	}

}
