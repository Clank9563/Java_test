package practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess_Number2 extends JFrame implements ActionListener {
	private JButton btn_Guess;
	private JTextField input_Edtext;
	private JTextArea ans_Log;
	private ImageIcon img;

	Guess_Number2() {
		super("1A2B遊戲");
		// 創立新物件按鈕和輸入窗跟顯示答案的地方
		btn_Guess = new JButton("猜");
		input_Edtext = new JTextField(40);
		ans_Log = new JTextArea();
		
		//傾聽器
		btn_Guess.addActionListener(this);
		
		//icon
		//TODO 未處理
		img = new ImageIcon("Guess_Number_icon.jpg");
		this.setIconImage(img.getImage());
		//guess.setIconImage(new ImageIcon("Guess_Number_icon.jpg").getImage());
		
		//版面設定
		//參考 https://dotblogs.com.tw/alex_space/2016/09/23/142234
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(input_Edtext,BorderLayout.CENTER);
		top.add(btn_Guess,BorderLayout.EAST);
		this.add(top,BorderLayout.NORTH);
		this.add(ans_Log,BorderLayout.CENTER);
		
		
		
		// 視窗畫面
		setSize(480, 600);
		setVisible(true);
		
		//關閉事件實作
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			closeFrame();
		}});

	}

	public static void main(String[] args) {
		Guess_Number2 guess = new Guess_Number2();
		

	}
	//關閉事件
	private void closeFrame() {//JOptionPane 對話框
		int result = JOptionPane.showConfirmDialog(this, "是否要退出1A2B的遊戲?"
				, "確認是否退出程式", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION) {
			this.dispose();//關閉程式
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String Input = input_Edtext.getText().toString().trim();
		ans_Log.append(Input+"\n");
		input_Edtext.setText(null);
		if(Input.equals("")) {
			JOptionPane.showConfirmDialog(btn_Guess,"請輸入數值!!!","錯誤",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
