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

public class MyDrawerV2 extends JPanel {
	private LinkedList<Line> lines, recycleBin;
	private Color nowColor;
	
	public MyDrawerV2() {
		setBackground(Color.YELLOW);

		nowColor = Color.BLUE;
		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();
		
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycleBin.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
			repaint();
		}
	}
	public Color getColor() {
		return nowColor;
	}
	public Color setColor(Color color) {
		return nowColor= color;
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		
		for (Line line : lines) {
			g2d.setColor(line.getColor());
			for (int i=1; i<line.size(); i++) {
				Point p0 = line.getPoint(i-1);
				Point p1 = line.getPoint(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}	
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Line line = new Line(nowColor);//點下去換新的顏色
			//https://blog.csdn.net/chen_z_p/article/details/82749846
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			line.addPoint(point);
			lines.add(line);

			repaint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			
			lines.getLast().addPoint(point);
			
			repaint();
		}
	}
	
	
}

 class Line {
	public Color color;
	private LinkedList<Point> points;
	Line(Color color){
		this.color = color;
		points = new LinkedList<>();
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public LinkedList<Point> getPoints() {
		return points;
	}
	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}
	
	public void addPoint(Point point) {
		points.add(point);
	}
	
	public Point getPoint(int index) {
		return points.get(index);
	}
	
	public int size() {
		return points.size();
	}
}
class Point {
	public int x, y;// getters and setters快速創立
}



