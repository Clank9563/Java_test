package tw.org.iii.tutor;

public class Jay28 {

	public static void main(String[] args) {
//		Jay281 obj1 = new Jay281(2);
//		Jay282 obj2 = new Jay282();
		Jay283 obj3 = new Jay283();//會先初始化281(int)=>282=>最後才叫283

	}

}

class Jay281 extends Object {// class只能相同backage呼叫;只要是列別都有建構式
	Jay281(int a) {
		// super();//super()永遠都在建構式第一列
		System.out.println("jay281(int)");
	}

}

class Jay282 extends Jay281 {//編譯器會自動幫你做無須參數的建構式，只要寫了編譯器就不會幫你"做無須參數的建構式"
	Jay282() {
		super(3);
		System.out.println("jay282()");
	}
}
class Jay283 extends Jay282{
	Jay283(){
		super();
		System.out.println("jay283()");
	}
}