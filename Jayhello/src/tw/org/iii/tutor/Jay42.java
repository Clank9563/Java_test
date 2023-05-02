package tw.org.iii.tutor;

public class Jay42 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c = {1,2,3,4};
		try {
			System.out.println(a / b);
			System.out.println(c[4]);
		}catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println("not much");
		}catch (ArithmeticException ae) {
			System.out.println("Ooop!");
		}catch (RuntimeException re) {
			System.out.println("Ooop!");
		}
		
		System.out.println("OK");
		
	}

}