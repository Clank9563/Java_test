package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class Jay03 {

	public static void main(String[] args) {
		String strx=JOptionPane.showInputDialog("x=?");
		String stry=JOptionPane.showInputDialog("y=?");
		int x = Integer.parseInt(strx);
		int y = Integer.parseInt(stry);
		int r = x+y;
		int d=x-y;
		int m=x*y;
		int i=x/y;
		int mod=x%y;
		JOptionPane.showMessageDialog(null,String.format("%d+%d=%d",x,y,r));
		JOptionPane.showMessageDialog(null,String.format("%d-%d=%d",x,y,d));
		JOptionPane.showMessageDialog(null,String.format("%d*%d=%d",x,y,m));
		JOptionPane.showMessageDialog(null,String.format("%d/%d=%d.....%d",x,y,i,mod));
//		JOptionPane.showMessageDialog(null,String.format(x+"+"+y+"="+r));

	}

}
