package tw.org.iii.tutor;

import java.util.Scanner;

public class Jay09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = (int) scanner.nextInt();
		boolean isLeap = true;
		if (year % 4 == 0) {
			isLeap = true;
		} else if (year % 100 == 0) {
			isLeap = true;
		} else if (year % 400 == 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		System.out.printf("%d年為%s年", year, (isLeap ? "潤" : "平"));
	}

}
