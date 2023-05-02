package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.lang.model.type.ReferenceType;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import tw.org.iii.myclasses.MyDrawerV2;
import tw.org.iii.myclasses.MyDrawerV3;

public class MysignV3 extends JFrame {
	private MyDrawerV3 myDrawer;
	private JButton clear, undo, redo, saveObj, loadObj,save;
	

	public MysignV3() {
		super("手寫簽名程式");

		myDrawer = new MyDrawerV3();
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		saveObj = new JButton("存檔");
		loadObj = new JButton("讀取");
		save = new JButton("存成圖檔");
		
		
		

		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);
		top.add(undo);
		top.add(redo);
		top.add(saveObj);
		top.add(loadObj);
		top.add(save);
		add(top, BorderLayout.NORTH);

		// 清除功能
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();

			}
		});

		// 上一步功能
		undo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();

			}
		});
		// 復原功能
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();

			}
		});
		// 存檔功能
		saveObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveObject();
			}
		});
		// 讀取功能
		loadObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadObject();
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveJPEGObject();
			}
		});

	}
	private void saveJPEGObject() {
		myDrawer.saveJPEG();
	}
	private void saveObject() {
		JFileChooser jfc = new JFileChooser();
		if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.saveLines(file.getAbsolutePath());
			myDrawer.clear();
		}
//		myDrawer.saveLines("dir1/lines");
	}
	
	private void loadObject() {
		JFileChooser jfc = new JFileChooser();
		if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.loadLines(file.getAbsolutePath());
		}
//		myDrawer.loadLines("dir1/lines");
	}
	
	

	public static void main(String[] args) {
		new MysignV3();
	}



}
