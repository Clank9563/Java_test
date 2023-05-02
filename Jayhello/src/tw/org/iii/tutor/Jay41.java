package tw.org.iii.tutor;

public class Jay41 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = { 1, 2, 3, 4 };

		try {
			System.out.println(a / b);
			System.out.println(c[4]);

		} catch (RuntimeException e) {//例外處理由小到大
			System.out.println("Oooop!");
		} catch (Exception ae) {
			System.out.println("not much");
			
		}
		System.out.println("ok");
	}

}
