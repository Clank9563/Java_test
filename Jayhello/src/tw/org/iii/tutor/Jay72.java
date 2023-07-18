package tw.org.iii.tutor;

public class Jay72 {

	public static void main(String[] args) {
		Jay721 obj1 = new Jay721("A");
		Jay721 obj2 = new Jay721("B");
		
		Jay722 obj3 = new Jay722("C");//沒繼承執行緒的方法
		Thread t1 = new Thread(obj3);
		obj1.start();//不是馬上做
		obj2.start();
		t1.start();
		
		System.out.println("main");
	}

}

class Jay721 extends Thread {
	String name;
	Jay721(String name){
	this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class Jay722 implements Runnable {
	String name;
	Jay722(String name){
	this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
