package tw.org.iii.tutor;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess_Number extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public Guess_Number(){
		super("猜數字遊戲");//JFrame(String title)
		guess =new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess,BorderLayout.EAST);
		top.add(input,BorderLayout.CENTER);
		add(top,BorderLayout.NORTH);
		add(log,BorderLayout.CENTER);
		
		//javax.swing寫最後
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Guess_Number();

	}

}
