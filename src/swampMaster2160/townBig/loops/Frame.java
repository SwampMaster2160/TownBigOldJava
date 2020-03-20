package swampMaster2160.townBig.loops;

import java.awt.Color;

import swampMaster2160.townBig.Assets;

import swampMaster2160.townBig.Window;

public class Frame extends Thread {
	Frame() {
		
		Window.graphic.setColor(Color.BLACK);
		Window.graphic.fillRect(0, 0, Window.realWidth, Window.realHeight);
		
		Window.graphic.drawImage(Assets.test0, 0, 0, null);
		Window.graphic.drawImage(Assets.test0, 64, 0, null);
		Window.graphic.drawImage(Assets.test1, 32, 17, null);
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				if ((x * y) % 3 < 2) {
					Window.graphic.drawImage(Assets.test0, (x * 64 + y * 64) / 2 + 100, (x * 68 - y * 68) / 4 + 300 + (int)(Tick100.time / 10) % 30, null);
				}
				else {
					Window.graphic.drawImage(Assets.test1, (x * 64 + y * 64) / 2 + 100, (x * 68 - y * 68) / 4 + 300 + (int)(Tick100.time / 10) % 30, null);
				}
			}
		}
		
		TPS.frames++;
	}
}
