package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.DebugGraphics;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyDrawerV3 extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycleBin;// <一條線>很多條線
	private JFileChooser saveFileChooser;
	private JFileChooser openFileChooser;

	public MyDrawerV3() {
		setBackground(Color.white);
		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);

		saveFileChooser = new JFileChooser();
		saveFileChooser.setFileFilter(new FileNameExtensionFilter("JPEG", "jpg", "jpeg"));
	}

	public void clear() {
		lines.clear();
		repaint();// 畫面異動
	}

	public void undo() {
		if (lines.size() > 0) {
			recycleBin.add(lines.removeLast());
		}
		repaint();
	}

	public void redo() {
		if (recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
		}
		repaint();

	}
	// 存

	// 1.直接丟出例外(throw)2.直接try-catch實作3.使用boolean傳回成功或失敗
	public boolean saveLines(String fname) {
		try (FileOutputStream fin = new FileOutputStream(fname);
				ObjectOutputStream oout = new ObjectOutputStream(fin)) {
			oout.writeObject(lines);
			oout.flush();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	// 讀
	public boolean loadLines(String fname) {
		try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fname))) {
			lines = (LinkedList<LinkedList<HashMap<String, Integer>>>) oin.readObject();
			repaint();
			recycleBin.clear();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean judge(String fname, String type) {
		int dot = fname.indexOf(".");
		String extenName = fname.substring(dot + 1, fname.length());// 拿到.之後的數值
		if (extenName.toLowerCase().equals(type) || extenName != "") {
			System.out.println("true");
			return false;

		} else {
			return true;
		}
	}

	public void saveJPEG() {
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_BGR);
		Graphics2D g2d = img.createGraphics();
		paint(g2d);

		int returnValue = saveFileChooser.showSaveDialog(this);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File saveFile = saveFileChooser.getSelectedFile();// 拿到User端這裡輸入的名稱
			System.out.println(saveFile.toString());
			if (judge(saveFile.toString(), "jpg")||judge(saveFile.toString(), "jpeg")) {
				System.out.println("jpg");
			} else if (judge(saveFile.toString(), "png")) {
				System.out.println("png");
			} else {
				saveFile = new File(saveFile.toString() + ".jpg");
				System.out.println("x");
			}

			try {

				ImageIO.write(img, "jpeg", saveFile);// "圖片",jpg,"文件保存路徑"第三個參數是File類型"

			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

	// 使用者畫面
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;// 要使用Graphics2D方法所以讓Graphics強制轉型成Graphics2D
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(4));

		// 點

		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i - 1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
	}

	private class MyListener extends MouseAdapter {// 巢狀類別方便存取
		@Override
		public void mousePressed(MouseEvent e) {
//			System.out.println("Pressed:" + e.getX() + "," + e.getY());測試
			recycleBin.clear();
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			HashMap<String, Integer> point = new HashMap<>();

			point.put("x", e.getX());
			point.put("y", e.getY());

			line.add(point);// 蒐集點

			lines.add(line);// 存到多個線
			repaint();// 畫面異動
		}

		@Override
		public void mouseDragged(MouseEvent e) {
//			System.out.println("Dragged:" + e.getX() + "," + e.getY());
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();// 畫面異動
		}
	}

}
