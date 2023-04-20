package tw.org.iii.tutor;

public class Jay13 {

	public static void main(String[] args) {
		int i = 0;
		for (printJay(); i < 10;printLine()) {
			System.out.println(i++);
		}
		System.out.println(i);

	}
	
	static void printJay(){
		int lottery =(int)(Math.random()*49);
		System.out.println("Jay"+lottery);
	}
	static void printLine(){
		System.out.println("-------");
	} 

}
