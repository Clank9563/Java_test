package tw.org.iii.tutor;

import tw.org.iii.myclasses.TWId;
import tw.org.iii.myclasses.TWId_T;

public class Jay23 {

	public static void main(String[] args) {
		String id = "V185035499";
		if (id.matches("[A-Z][1289][0-9]{8}")) {//正規表達式
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("---------------------");
//		TWId_T id1 = new TWId_T();
//		TWId_T id2 = new TWId_T(1);
//		TWId_T id3 = new TWId_T(false);
//		TWId_T id4 = new TWId_T(true,0);
		TWId id1 = new TWId();
		TWId id2 = new TWId(1);
		TWId id3 = new TWId(false);
		TWId id4 = new TWId(true,0);
		
		
		System.out.println(id1.checkId("V185035499"));
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWId_T id5 = TWId_T.createTWID("A123456789");
		System.out.println(id5.getId());
		

	}

}
