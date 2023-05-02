package tw.org.iii.tutor;

import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jay44 {

	public static void main(String[] args) {

		try {
			new Jay441().m1();
		} catch (Exception e) {
		}

	}

}

class Jay441 {
	void m1() throws Exception {
		m2();
	};

	void m2() throws Exception {
		m3(3);
	};

	void m3(int a) throws FontFormatException, IOException {
		if (a > 0) {
			throw new FontFormatException(null);

		} else {
			throw new FileNotFoundException();
		}
	};

}

class Jay442 extends Jay441 {
	void m3(int b) throws IOException {// 不會拋出比父類別更多的例外
	}
}