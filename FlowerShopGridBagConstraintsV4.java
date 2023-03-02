package FinehoutIsaac_DiscWeek8;

/**
 *
 * An abstract class that fills in the components' constraints for the 9 different parts of the FlowerShop GUI interface
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
*
* @version FlowerShopV4
* @author fineh
 */
import java.awt.GridBagConstraints;

public abstract class FlowerShopGridBagConstraintsV4 {

	public static GridBagConstraints[] getFlowerShopConstraints() {

		GridBagConstraints[] flowerShopGridBagLayoutConstraints = new GridBagConstraints[9];

		// Set each grid bag constraint as a non - null constraint
		for (int i = 0; i < 9; i++) {
			flowerShopGridBagLayoutConstraints[i] = new GridBagConstraints();
		}

		// Create Saved Customer Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].gridx = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].gridy = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].weightx = .4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].weighty = .4;

		// Create Customers Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].gridx = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].gridy = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].gridwidth = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].weightx = .6;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.CUSTOMERS_COMPONENT].weighty = .6;

		// Create Friend Preferences Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].gridx = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].gridy = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].weightx = .4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].weighty = .4;

		// Create Sell Options Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].gridx = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].gridy = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].gridheight = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].weightx = .6;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT].weighty = .6;

		// Create Flower Shop Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].gridx = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].gridy = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].gridheight = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].gridwidth = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].weightx = .5;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].weighty = .5;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].ipadx = 500;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT].ipady = 25;

		// Create Flower Management Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].gridx = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].gridy = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].gridheight = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].weightx = .6;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].weighty = .6;

		// Create Stats Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.STATS_COMPONENT].gridx = 0;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.STATS_COMPONENT].gridy = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.STATS_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.STATS_COMPONENT].weightx = .4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.STATS_COMPONENT].weighty = .4;

		// Create Flowers Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].gridx = 1;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].gridy = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].gridwidth = 3;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].weightx = .6;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.FLOWERS_COMPONENT].weighty = .6;

		// Create End Day Component Constraints
		flowerShopGridBagLayoutConstraints[FlrCmpV4.END_DAY_COMPONENT].gridx = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.END_DAY_COMPONENT].gridy = 4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.END_DAY_COMPONENT].fill = GridBagConstraints.BOTH;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.END_DAY_COMPONENT].weightx = .4;
		flowerShopGridBagLayoutConstraints[FlrCmpV4.END_DAY_COMPONENT].weighty = .4;

		return flowerShopGridBagLayoutConstraints;
	}

}
