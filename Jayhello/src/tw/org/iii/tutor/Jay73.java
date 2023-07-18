package tw.org.iii.tutor;

import java.awt.Taskbar;
import java.util.Timer;
import java.util.TimerTask;

public class Jay73 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Jay731 task = new Jay731();
		timer.schedule(new Jay732(timer), 10 * 1000);
		timer.schedule(task, 3 * 1000);
		timer.schedule(new Jay733(),0,1000);
		System.out.println("main");
	}

}

class Jay731 extends TimerTask {
	@Override
	public void run() {
		System.out.println("ok");
	}
}

class Jay732 extends TimerTask {
	private Timer timer;

	Jay732(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;

	}
}

class Jay733 extends TimerTask {
	private int i;

	@Override
	public void run() {
		System.out.println(i++);
	}
}
