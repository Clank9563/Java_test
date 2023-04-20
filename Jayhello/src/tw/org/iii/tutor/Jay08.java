package tw.org.iii.tutor;

public class Jay08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double temp = Math.random()*101;
//		int score = (int)(temp);
//		System.out.println(score);
//		if(score>=60){
//			System.out.println("Pass");
//		}else {
//			System.out.println("Down");
//		}
		int score =(int)(Math.random()*101);//0-100
		System.out.println(score);
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80){
				System.out.println("B");
			}else if(score>=70){
					System.out.println("C");
				}else if(score>=60){
						System.out.println("D");
					}else {
						System.out.println("E");
					}
		
			
	
		
		
		
	}

}
