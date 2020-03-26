package swampMaster2160.townBig;
import java.io.IOException;

import javax.imageio.ImageIO;

import swampMaster2160.lib.text.SMString8;

public class LoadAssets {
	LoadAssets() {
		try {
			Assets.images.append(new SMString8("test0"), ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/test0.png")));
			Assets.images.append(new SMString8("test1"), ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/test1.png")));
			Assets.images.append(new SMString8("road0"), ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/road0.png")));
			Assets.images.append(new SMString8("high0"), ImageIO.read(LoadAssets.class.getResource("/swampMaster2160/townBig/assets/test/high0.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
