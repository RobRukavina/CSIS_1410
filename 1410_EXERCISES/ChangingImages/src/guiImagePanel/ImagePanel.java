package guiImagePanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Represents an image panel that is a subclass of JPanel
 * 
 * @author Rob R.
 */
@SuppressWarnings("serial")
public class ImagePanel extends JPanel {
	private String[] ris = {
			"/guiImagePanel/Images/roof1.png",
			"/guiImagePanel/Images/roof2.png",
			"/guiImagePanel/Images/roof3.png",
			"/guiImagePanel/Images/roof4.png",
	};
	private String[] wis = {
			"/guiImagePanel/Images/w1.png",
			"/guiImagePanel/Images/w2.png",
			"/guiImagePanel/Images/w3.png",
			"/guiImagePanel/Images/w4.png",
	};
	private String[] tis = {
			"/guiImagePanel/Images/t1.png",
			"/guiImagePanel/Images/t2.png",
			"/guiImagePanel/Images/t3.png",
			"/guiImagePanel/Images/t4.png",
	};
	int i1Idx = 0;
	int i2Idx = 0;
	int i3Idx = 0;
	private String iString = ris[i1Idx];
	private String iString2 = wis[i2Idx];
	private String iString3 = tis[i3Idx];
	private ImageIcon icon;
	private ImageIcon icon2;
	private ImageIcon icon3;
	
	
	
	/**
	 * Creates the Image Panel.
	 * 
	 */
	public ImagePanel() {
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	/**
	 * Changes the images displayed based on input from checkbox's
	 * If any of the arguments are greater than 0,
	 * the corresponding image will change.
	 * If the arguments are all 0, the background image will change.
	 * 
	 * @param iconNum
	 * @param iconNum2
	 * @param iconNum3
	 */
	public void changeImage(int iconNum, int iconNum2, int iconNum3) {
		if(iconNum > 0) {
			i1Idx = ++i1Idx % ris.length;
			iString = ris[i1Idx];
		}
		
		if(iconNum2 > 0) {
			i2Idx = ++i2Idx % wis.length;
			iString2 = wis[i2Idx];
		}
		
		if(iconNum3 > 0) {
			i3Idx = ++i3Idx % tis.length;
			iString3 = tis[i3Idx];
		}

		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		icon = new ImageIcon(
				ImagePanel.class.getResource(iString));
		icon.paintIcon(this, g, 80, 10);
		
		icon2 = new ImageIcon(
				ImagePanel.class.getResource(iString2));
		icon2.paintIcon(this, g, 80, 10);
		
		icon3 = new ImageIcon(
				ImagePanel.class.getResource(iString3));
		icon3.paintIcon(this, g, 80, 10);
	}

}
