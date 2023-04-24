package tw.org.iii.tutor;

public class Jay30 {

	public static void main(String[] args) {
		
//		Jay301 obj1 = new Jay301();//抽象類別無法直接建立物件，必須由後代子孫繼承才能建立
		Jay301 obj2 = new Jay302();
		Jay301 obj3 = new Jay303();
		Jay301 obj4 = new Jay302();
		obj2.m2();
		obj3.m2();
		obj4.m1();

	}


}
abstract class Jay301{//裡面有抽象方法外部class一定要宣告抽象類別
	Jay301(int a){//抽象類別也有建構式
		System.out.println("Jay301();");
	}
	void m1() {System.out.println("Jay301:m1();");}
	abstract void m2();
}
class Jay302 extends Jay301{
	Jay302(){
		super(2);
		System.out.println("Jay302();");
	}
	void m2() {System.out.println("Jay302:m2();");}
}
class Jay303 extends Jay301{
	Jay303(){
		super(3);
	}
	void m2() {System.out.println("Jay303:m2();");}
}
