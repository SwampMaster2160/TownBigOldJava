package swampMaster2160.townBig.loops;

import java.util.Timer;
import java.util.TimerTask;

public class Loops {
	static Timer timer = new Timer();
	
	public Loops() {
		timer.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				  new Frame();
			  }
		}, 100/6, 100/6);
		
		timer.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				  new TPS();
			  }
		}, 1000, 1000);
		
		timer.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				  new Tick10();
			  }
		}, 100, 100);
		
		timer.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				  new Tick100();
			  }
		}, 10, 10);
	}
}
