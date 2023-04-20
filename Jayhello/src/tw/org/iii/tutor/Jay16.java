package tw.org.iii.tutor;

public class Jay16 {

	public static void main(String[] args) {
		int p[]=new int[7];
//		----------------------------------
//		for (int i = 0; i < 100; i++) {
//			int point = (int) (Math.random() * 6 + 1);
//			if(point>0&&point<=6) {
//				p[point]++;
//			}else {
//				p[0]++;
//			}
//		--------------------------------------------
		for (int i = 0; i < 100; i++) {
			int point = (int) (Math.random() * 9 + 1);
			if(point>0&&point<=9) {
				p[point>=7?point-3:point]++;
			}else {
				p[0]++;
			}
//			------------------------------------
			
			
//			switch (point) {
//			case 1:
//				p[0]++;
//				break;
//			case 2:
//				p[1]++;
//				break;
//			case 3:
//				p[2]++;
//				break;
//			case 4:
//				p[3]++;
//				break;
//			case 5:
//				p[4]++;
//				break;
//			case 6:
//				p[5]++;
//				break;
//			default:
//				System.out.println("錯誤");
//				break;
//			}
		}
		if(p[0]==0) {
		for(int k=1;k<p.length;k++) {
			System.out.println(k+"點出現幾次"+p[k]);
		
		}
		}else {
			System.out.println(p[0]);
		}
		System.out.println("--------------------");
		//for-each
		for(int v: p ) {
			System.out.println(v);
		}
	

	}

}
