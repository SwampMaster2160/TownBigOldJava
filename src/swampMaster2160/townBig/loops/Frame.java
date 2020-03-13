package swampMaster2160.townBig.loops;

import java.awt.Color;

import swampMaster2160.townBig.Window;

public class Frame extends Thread {
	Frame() {
		for(int x = 0; x < Window.realWidth; x++) {
			for(int y = 0; y < Window.realHeight; y++) {
				int r = (int)(Math.random() * 255);
				Window.image.setRGB(x, y, new Color(r, r, r).getRGB());
			}
		}
		Window.graphic.drawImage(Window.image, 0, 0, null);
		
		TPS.frames++;
	}
}
