package swampMaster2160.townBig.loops;

public class TPS {
	public static boolean logTickRates = true;
	
	public static long lastTime = 0;
	
	public static int fps = 0;
	public static int tps10 = 0;
	public static int tps100 = 0;
	
	public static int frames = 0;
	public static int ticks10 = 0;
	public static int ticks100 = 0;
	
	public static double tick100Slow = 0;
	
	TPS() {
		tick100Slow = 1000D / (System.currentTimeMillis() - lastTime);
		
		fps = (int)((double)frames * tick100Slow);
		frames = 0;
		
		tps10 = (int)((double)ticks10 * tick100Slow);
		ticks10 = 0;
		
		tps100 = (int)((double)ticks100 * tick100Slow);
		ticks100 = 0;
		
		if(logTickRates) System.out.println("FPS: " + fps + "		TPS10: " + tps10 + "	TPS100: " + tps100 + "	Time: "+ Tick100.time + ", " + tick100Slow);
	
		lastTime = System.currentTimeMillis();
	}
}
