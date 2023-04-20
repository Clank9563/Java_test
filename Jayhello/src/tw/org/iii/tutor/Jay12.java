package tw.org.iii.tutor;

public class Jay12 {

	public static void main(String[] args) {
		int month =(int)( Math.random()*12+1);
		int day = 0;
		switch (month) {
		case 1,3,5,7,8,10,12:
			day = 31;
			break;
		case 4,6,9,11:
			day = 30;
			break;	
		case 2:
			day = 28;
			break;
		default:
			System.out.println("XX");
			break;			
		}
		System.out.printf("%d月有%d天",month,day);

	}

}
