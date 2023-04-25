package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.MyDrawer;

public class Mysign extends JFrame{
	private MyDrawer myDrawer;
	private JButton clear,undo,redo;
	public Mysign(){
		super("手寫簽名程式");
		
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		
	
		
		MyDrawer myDrawer = new MyDrawer();
		setLayout(new BorderLayout());
		add(myDrawer,BorderLayout.CENTER);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel top =  new JPanel(new FlowLayout());
		top.add(clear);
		top.add(undo);
		top.add(redo);
		add(top,BorderLayout.NORTH);
		
		//清除功能
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
				
			}
		});
		
		//上一步功能
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
				
			}
		});
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
				
			}
		});
		
	}

	public static void main(String[] args) {
		new Mysign();
	}

}
