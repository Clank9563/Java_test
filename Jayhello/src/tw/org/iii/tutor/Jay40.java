package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class Jay40 {

	public static void main(String[] args) {
		HashMap<String,Object> map= new HashMap<>();
		map.put("name","Jay");
		map.put("gender", true);
		map.put("age", 18);
		System.out.println(map.get("name"));
		System.out.println("---------");
		
		Set<String> keys = map.keySet();//泛型完都是物件
		for(String key : keys) {
			System.out.println(map.get(key));
		}
	}

}
