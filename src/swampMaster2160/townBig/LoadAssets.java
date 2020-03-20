package swampMaster2160.townBig;

import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadAssets {
	LoadAssets() {
		try {
			Assets.test0 = ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/test0.png"));
			Assets.test1 = ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/test1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
