package tw.org.iii.tutor;

import java.util.Scanner;

public class Jay02 {

	public static void main(String[] args) {
		// input=>10+3=13
		Scanner scanner = new Scanner(System.in);
		System.out.println("x= ");		
		int x =scanner.nextInt();
		System.out.println("y= ");		
		int y =scanner.nextInt();
		int r=x+y;
		int d=x-y;
		int m=x*y;
		int i=x/y;
		int mod=x%y;
		
//		System.out.println(x+"+"+y+"="+r);
		System.out.printf("%d+%d=%d\n",x,y,r);
		System.out.printf("%d-%d=%d\n",x,y,d);
		System.out.printf("%d*%d=%d\n",x,y,m);
		System.out.printf("%d/%d=%d....%d\n",x,y,i,mod);
	}

}
