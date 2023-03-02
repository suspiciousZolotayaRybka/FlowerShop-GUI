package FinehoutIsaac_DiscWeek8;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 *
 * A Class used to create the display panel for the Stats Component
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
public abstract class ComponentStatsV4 {

	protected static class StatsDisplay extends JPanel {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			// Declare Stats Component attributes
			String day = String.valueOf(FlowerShopV4.getDay());
			String money = String.valueOf(FlowerShopV4.getMoney());
			int sales = FlowerShopV4.getNumRatings() - 1;
			double rating = FlowerShopV4.getAverageRating();

			g.setColor(Color.lightGray);
			g.fillRect(0, 0, 300, 300);
			g.setColor(Color.black);
			// Draw categories
			g.drawString("Day:", 0, 25);
			g.drawString("Money:", 0, 65);
			g.drawString("Number of Sales: ", 0, 105);
			g.drawString("Rating: ", 0, 145);

			// Draw category information
			g.setColor(Color.magenta);
			g.drawString(day, 150, 25);
			g.drawString("$" + money, 150, 65);
			// This uses a ternary expression to choose whether to use the plural form of
			// customer, based on the number of customers sold to so far
			g.drawString(String.format("%d %s", sales, (sales == 1 ? "customer" : "customers")), 150, 105);
			g.drawString(String.format("%.2f", rating), 150, 145);
		}
	}

}
