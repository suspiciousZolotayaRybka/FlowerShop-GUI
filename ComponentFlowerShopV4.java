package FinehoutIsaac_DiscWeek8;

/**
*
* A Class used to create the content for the middle panel of FlowerShop GUI
* The middle panel allows the user to see their nameFlowerShop and current weather
*
* Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
*
* @version FlowerShopV4
* @author fineh
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class ComponentFlowerShopV4 implements FlrCmpV4 {

	protected static class FlowerShopImagePanel extends JPanel {

		/**
		 *
		 */

		private static final long serialVersionUID = 1L;
		private final Image img;

		public FlowerShopImagePanel(String imgPath) {
			this(new ImageIcon(imgPath).getImage());
		}

		public FlowerShopImagePanel(Image img) {
			this.img = img;
			Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
			setPreferredSize(size);
			setMinimumSize(size);
			setMaximumSize(size);
			setSize(size);
			setLayout(null);
		}

		@Override
		public void paintComponent(Graphics g) {
			// Fill a black background
			g.setColor(Color.black);
			g.fillRect(0, 0, 1000, 500);
			// Add the image
			g.drawImage(img, 300, 75, null);
			// Add a grey rectangle background for text
			g.setColor(Color.lightGray);
			g.fillRect(300, 20, 256, 55);
			// Add text
			g.setColor(Color.black);
			// Center align the name and weather
			g.drawString(FlowerShopV4.getNameFlowerShop(), 300 + (100 - (FlowerShopV4.getNameFlowerShop().length())),
					60);
			g.setColor(Color.magenta);
			g.drawString(FlowerShopV4.getStringWeather(), 300 + (115 - (FlowerShopV4.getStringWeather().length())), 70);
		}
	}

}
