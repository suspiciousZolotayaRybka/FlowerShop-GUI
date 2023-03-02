package FinehoutIsaac_DiscWeek8;

/**
 *
 * A Class used to fill in the JPanel content for FlowerShop
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class FlowerShopContentV4 implements FlrCmpV4 {

	protected static JPanel[] getFlowerShopContent() {
		JPanel tempFlowerShopContent[] = new JPanel[9];
		for (int i = 0; i < 9; i++) {
			tempFlowerShopContent[i] = new JPanel(new BorderLayout());
		}

		/*-*
		 * Set the flower shop component (CENTER)
		 * This is a picture of an AI generated flower shop,
		 * with the user's flower shop name and current weather
		 * Controlled in the FlowerShopComponent abstract class
		 */
		ComponentFlowerShopV4.FlowerShopImagePanel flowerShopDisplay = new ComponentFlowerShopV4.FlowerShopImagePanel(
				FlowerShopV4.getFilePathsForPhotos()[FlrCmpV4.SUNNY_WEATHER_PHOTO]);
		tempFlowerShopContent[FlrCmpV4.FLOWER_SHOP_COMPONENT].add(flowerShopDisplay);

		/*-*
		 * Set the stats component (LAST_LINE_START)
		 * This shows the user's day, money, transactions, and average rating
		 * Controlled in the StatsComponent abstract class
		 */
		tempFlowerShopContent[FlrCmpV4.STATS_COMPONENT] = new ComponentStatsV4.StatsDisplay();

		/*-*
		 * Set the flowers component (PAGE_END)
		 * This shows the users current flowers in an ASCII art display panel
		 * Controlled in the ComponentFlowers abstract class
		 */
		// tempFlowerShopContent[FlrCmpV3.FLOWERS_COMPONENT] = new

		/*-*
		 * Set the end day button (LAST_LINE_END)
		 * Controlled in the EndDayComponent abstract class
		 */
		// TODO add tips button
		JButton endDayButton = new JButton("End Day");
		endDayButton.addActionListener(new ComponentEndDayV4.EndDayButtonHandler());
		tempFlowerShopContent[FlrCmpV4.END_DAY_COMPONENT].add(endDayButton);

		return tempFlowerShopContent;
	}

}
