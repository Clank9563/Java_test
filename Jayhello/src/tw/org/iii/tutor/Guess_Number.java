package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;

public class Guess_Number extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;

	public Guess_Number() {
		super("猜數字遊戲");// JFrame(String title)
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();

		guess.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 20));// monospaced:等寬字體

		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

//		guess.addActionListener(new MyListener());;
		guess.addActionListener(this);
		

		// javax.swing寫最後
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		answer = createAnswer(4); 

	}

	public static void main(String[] args) {
		new Guess_Number();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strInput = input.getText().trim();
		String result = cheakAB(strInput);
		log.append(strInput+"=>"+result + "\n");
		input.setText(null);

	}
	
	private String cheakAB(String guess) {
		int A,B;A=B=0;
		for(int i=0;i<guess.length();i++) {
			char c = guess.charAt(i);
			if(c==answer.charAt(i)) {
				A++;
			}else if(answer.indexOf(c)!=-1) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}
	private String createAnswer(int n) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
//			 poker[rand] <=> poker[i]
			int tempt = poker[rand];
			poker[rand] = poker[i];
			poker[i] = tempt;
		}
		StringBuffer sb = new StringBuffer();
		for(int i= 0;i<n;i++) {
			sb.append(poker[i]);
		}

//		for (int v : poker) {
//			System.out.println(v);
//		}
		return sb.toString();
	}

}

class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("按下去了");

	}

}
