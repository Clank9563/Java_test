package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.MyDrawerV2;

public class MySignV2 extends JFrame{
	private MyDrawerV2 myDrawer;
	private JButton clear, undo, redo, chColor;
	
	public MySignV2() {
		super("簽名");
	
		myDrawer = new MyDrawerV2();
		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(chColor);
		
		add(top, BorderLayout.NORTH);
		
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
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
		
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(
			null, "Change Color", myDrawer.getColor());
		if (newColor != null) {
			myDrawer.setColor(newColor);
		}
	}

	public static void main(String[] args) {
		new MySignV2();
	}

}