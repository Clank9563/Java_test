package tw.org.iii.tutor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RacingV2 extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private int rank;

	public RacingV2() {
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
			}

			private void go() {
				rank = 0;
				go.setEnabled(false);
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
				if(rank==1) {finish();
					
				}
				try {
					Thread.sleep(10+(int)(Math.random()*1000));
				} catch (InterruptedException e) {
					break;
				}
			}
			
		}
	}
	public void finish() {
		for(Car car: cars) {
			car.interrupt();//觸發例外interrupted
		}
		go.setEnabled(true);
	}

	public static void main(String[] args) {
		new RacingV2();
	}
	

}
