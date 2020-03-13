package swampMaster2160.townBig;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	public static int width = 800;
	public static int height = 600;
	public static boolean fullscreen = false;
	
	public static int realWidth = 0;
	public static int realHeight = 0;
	
	public static JFrame window;
	public static JPanel panel;
	public static BufferedImage image;
	public static Graphics graphic;
	
	public Window() {
		if(window != null) window.dispose();
		
		window = new JFrame("TownBig");
		panel = new JPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.add(panel);
		window.requestFocusInWindow();
		
		if(fullscreen) {
			window.setExtendedState(JFrame.MAXIMIZED_BOTH);
			window.setUndecorated(true);
			window.setVisible(true);
			
			realWidth = window.getSize().width;
			realHeight = window.getSize().height;
		}
		else {
			realWidth = width;
			realHeight = height;
		}
		
		panel.setPreferredSize(new Dimension(realWidth, realHeight));
		window.pack();
		window.validate();
		window.setVisible(true);
		image = new BufferedImage(realWidth, realHeight, BufferedImage.TYPE_INT_RGB);
		graphic = panel.getGraphics();
		
		for(int x = 0; x < realWidth; x++) {
			for(int y = 0; y < realHeight; y++) {
				image.setRGB(x, y, new Color(0, 0, 0).getRGB());
			}
		}
		
		graphic.drawImage(image, 0, 0, null);
		
	}
	
}
