package tw.org.iii.tutor;
//r
public class Jay29 {

	public static void main(String[] args) {
		Jay292 obj1 = new Jay292();
		Jay291 obj2 = new Jay292();
		Jay291 obj3 = new Jay293(); 
		dothing(obj1);

	}
	static void dothing(Jay291 obj) {
		obj.m1();
	}

}

class Jay291 {
	void m1() {
		System.out.println("Jay291:m1()");
	}
}

class Jay292 extends Jay291 {
	void m1() {
		System.out.println("Jay292:m1()");
	}

	void m2() {
		System.out.println("Jay292:m2()");
	}
}
class Jay293 extends Jay291 {
	void m1() {
		System.out.println("Jay293:m1()");
	}

	void m2() {
		System.out.println("Jay293:m2()");
	}
}
