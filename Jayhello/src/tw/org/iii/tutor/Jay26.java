package tw.org.iii.tutor;

public class Jay26 {

	public static void main(String[] args) {
		byte b1 = 123;
		int i1= b1;
		int i2 = 128;
		byte b2= (byte)i2;
		System.out.println(b2);//超過byte的值，喪失精確度
		System.out.println("-------");
		byte b3 = 127;
		b3++;
		System.out.println(b3);

	}

}
