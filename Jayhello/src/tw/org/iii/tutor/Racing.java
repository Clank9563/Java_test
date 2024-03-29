package tw.org.iii.tutor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private int rank;

	public Racing() {
		super("賽車遊戲");

		setLayout(new GridLayout(9, 1));
		go = new JButton("GO!");
		add(go);
		lanes = new JLabel[8];// 0-7
		for (int i = 0; i < lanes.length; i++) {
			lanes[i] = new JLabel((i + 1)+"" );
			add(lanes[i]);
		}
		go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				go();
				go.setEnabled(false);
			}

			private void go() {
				rank = 0;
				for(int i=0;i<lanes.length;i++) {
					lanes[i].setText((i + 1)+".");
				}
				cars = new Car[8];
				for (int i = 0; i < cars.length; i++) {
					cars[i] = new Car(i);
					cars[i].start();
				}
				
			}
		});

		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class Car extends Thread {
		private int lane;

		Car(int lane) {
			this.lane = lane;
		}

		@Override
		public void run() {
			super.run();
			for(int i=0; i<100;i++) {
				lanes[lane].setText(
						lanes[lane].getText()+">"+((i==99)?++rank:""));
				if(rank==8) {
					go.setEnabled(true);
				}
				try {
					Thread.sleep(10+(int)(Math.random()*200));
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		new Racing();
	}

}
