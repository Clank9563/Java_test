package practice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class windows_Closing extends JFrame {
	public static void main(String[] args) {
		new windows_Closing();
	}

	public windows_Closing() {
		// 創建一個JPanel物件
		JPanel paContent = new JPanel(new FlowLayout(FlowLayout.CENTER));
		paContent.setPreferredSize(new Dimension(400, 100));
		// 在JPanel物件中創造一個按關閉按鈕
		JButton btn = new JButton("關閉");
		btn.setPreferredSize(new Dimension(100, 25));
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				closeFrame();
			}

		});
		// 向面板中加载按钮
		paContent.add(btn);

		// 设置面板
		this.setTitle("關閉事件測試");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setContentPane(paContent);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("觸發windowClosing事件");
				closeFrame();
			}

			public void windowClosed(WindowEvent e) {
				System.out.println("觸發windowClosed事件");
			}
		});
	}

	// 右上
	private void closeFrame() {
		System.out.println("調用視窗關閉功能");
		int result = JOptionPane.showConfirmDialog(null, "是否要退出？", "確認退出", JOptionPane.YES_NO_OPTION,
				// https://yhhuang1966.blogspot.com/2014/05/java-swing_18.html
				JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION)
			this.dispose();
	}
}