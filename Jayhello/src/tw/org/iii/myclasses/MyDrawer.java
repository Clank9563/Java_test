package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<Point>> lines,recycleBin;// <一條線>很多條線

	public MyDrawer() {
		setBackground(Color.white);
		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}

	public void clear() {
		lines.clear();
		repaint();//畫面異動
	}
	public void undo() {
		if(lines.size()>0) {
			recycleBin.add(lines.removeLast());			
		}
		repaint();
	}
	public void redo() {
		if(recycleBin.size()>0) {
			lines.add(recycleBin.removeLast());
		}
		repaint();
		
	}

	// 使用者畫面
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;// 要使用Graphics2D方法所以讓Graphics強制轉型成Graphics2D
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(4));

		// 點

		for (LinkedList<Point> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				Point p0 = line.get(i - 1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
	}

	private class MyListener extends MouseAdapter {// 巢狀類別方便存取
		@Override
		public void mousePressed(MouseEvent e) {
//			System.out.println("Pressed:" + e.getX() + "," + e.getY());測試
			recycleBin.clear();
			LinkedList<Point> line = new LinkedList<>();
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			line.add(point);// 蒐集點

			lines.add(line);// 存到多個線
			repaint();//畫面異動
		}

		@Override
		public void mouseDragged(MouseEvent e) {
//			System.out.println("Dragged:" + e.getX() + "," + e.getY());
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			lines.getLast().add(point);
			repaint();//畫面異動
		}
	}
	class Point {
		private int x, y;// getters and setters快速創立
	}
}


