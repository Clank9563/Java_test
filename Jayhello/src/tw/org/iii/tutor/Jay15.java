package tw.org.iii.tutor;

public class Jay15 {

	public static void main(String[] args) {
		int p0,p1, p2, p3, p4, p5, p6;
		p0=p1 = p2 = p3 = p4 = p5 = p6 = 0;
		for (int i = 0; i < 100; i++) {
			int point = (int) (Math.random() * 6 + 1);
			switch (point) {
			case 1:
				p1++;
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			default:
				p0++;
				break;
			}
		}
		System.out.println("1點出現幾次"+p1);
		System.out.println("2點出現幾次"+p2);
		System.out.println("3點出現幾次"+p3);
		System.out.println("4點出現幾次"+p4);
		System.out.println("5點出現幾次"+p5);
		System.out.println("6點出現幾次"+p6);
		System.out.println("0點出現幾次"+p0);

	}

}
