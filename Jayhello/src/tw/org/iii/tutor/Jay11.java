package tw.org.iii.tutor;

public class Jay11 {

	public static void main(String[] args) {
		int a=3,b=2;
		System.out.println(a&b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("a = %d; b = %d",a,b);

	}

}
