package tw.org.iii.tutor;

public class Jay43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3);//方法定義有可能拋出例外所以要在try catch裡面
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Error");
//			e.printStackTrace();
		}

	}

}

class Bird {
	private int leg;

	void setLeg(int leg) throws Exception{//宣告這裡有可能拋出例外
		if(leg>0&&leg<3) {
			this.leg =leg;			
		}else {
			throw new Exception();
		}
	}
}
