package tw.org.iii.tutor;

public class Jay34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Jay341{
	void m1();
}
interface Jay342{
	void m2();
}
interface Jay343 extends Jay341,Jay342{//可以有多個父介面
	void m3();
}
class Jay344 implements Jay343{
	public void m1(){};
	public void m2(){};
	public void m3(){};

}
