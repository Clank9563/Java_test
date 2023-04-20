package tw.org.iii.tutor;



public class PokerV3 {

	public static void main(String[] args) {
		//hw
		int temp[] = new int[52];
		for (int i=0; i<temp.length; i++) {
			temp[i]=i;
		}
		int newj=51,newi;
		for(int j=0;j<temp.length;j++) {
			
			newi=newj-1;
			
//			System.out.println("後"+newj);
			int s=(int)(Math.random()*newi);
//			System.out.println("前"+s);
			
			temp[newj]=temp[newj]^temp[s];
			temp[s]=temp[newj]^temp[s];
			temp[newj]=temp[newj]^temp[s];
			
			
		}
		for(int v:temp) {
			System.out.println(v);
		}
//-------------------------------------------------老師版本
//		int num = 10;
//		int[] poker = new int[num];
//		for (int i = 0; i<poker.length; i++) poker[i] = i;
//		
//		for (int i = num-1; i > 0; i--) {
//			int rand = (int)(Math.random()*(i+1));
//			// poker[rand] <=> poker[i]
//			int tempt = poker[rand];
//			poker[rand] = poker[i];
//			poker[i] = tempt;
//		}
//		
//		for (int v : poker) {
//			System.out.println(v);
//		}
	}
}
