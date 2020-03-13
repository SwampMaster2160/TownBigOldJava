package swampMaster2160.townBig.loops;

public class Tick100 {
	public static long time = 0;
	
	Tick100() {
		TPS.ticks100++;
		
		time++;
	}
}
