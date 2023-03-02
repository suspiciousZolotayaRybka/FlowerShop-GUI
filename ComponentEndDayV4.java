package FinehoutIsaac_DiscWeek8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;

/**
 *
 * A Class used to create the listener for the end day button of FlowerShop GUI
 * The end day button triggers a special event and changes the weather. The day
 * is then progressed by one.
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
public abstract class ComponentEndDayV4 {

	protected static class EndDayButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			// TODO
			// Special event happens

			// Increase the day by one
			FlowerShopV4.setDay(FlowerShopV4.getDay() + 1);
			// SCAFFOLDING TODO delete
			System.err.println(FlowerShopV4.getDay());
			System.out.println(FlowerShopV4.getStringWeather());
			// SCAFFOLDING TODO delete

			// Randomize the weather
			Random ranInt = new Random();
			FlowerShopV4.setWeather(ranInt.nextInt(5));

			// Revalidate and Repaint the FlowerShopComponent
			JPanel flowerShopImagePanel = new JPanel();
			// If the weather is Sunny, Cloudy, or Windy, return the sunny image.
			if ((FlowerShopV4.getWeather() == FlrCmpV4.SUNNY_WEATHER)
					|| (FlowerShopV4.getWeather() == FlrCmpV4.CLOUDY_WEATHER)
					|| (FlowerShopV4.getWeather() == FlrCmpV4.WINDY_WEATHER)) {
				flowerShopImagePanel = new ComponentFlowerShopV4.FlowerShopImagePanel(
						FlowerShopV4.getFilePathsForPhotos()[FlrCmpV4.SUNNY_WEATHER_PHOTO]);
				// Weather is cloudy or extreme, return the rainy picture
			} else {
				flowerShopImagePanel = new ComponentFlowerShopV4.FlowerShopImagePanel(
						FlowerShopV4.getFilePathsForPhotos()[FlrCmpV4.RAINY_WEATHER_PHOTO]);
			}
			FlowerShopV4.revalidateFlowerShop(FlrCmpV4.FLOWER_SHOP_COMPONENT, flowerShopImagePanel);

			// Revalidate the stats component for a new day
			FlowerShopV4.revalidateFlowerShop(FlrCmpV4.STATS_COMPONENT, new ComponentStatsV4.StatsDisplay());

		}
	}

}
