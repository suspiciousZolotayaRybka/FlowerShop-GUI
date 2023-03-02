package FinehoutIsaac_DiscWeek8;

/**
 *
 * The main driver for FlowerShop.
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
import java.awt.BorderLayout;
/**
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/2/2023
 *
 * TODO
 *
 * @author fineh
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FlowerShopV4 {

	// FlowerShop GUI Components
	private static String filePathForPhotos;
	private static String[] filePathsForPhotos = new String[5];
	private static JFrame flowerShopWindow;
	private static GridBagConstraints[] flowerShopConstraints;
	private static JPanel[] tempFlowerShopContent;
	private static JPanel flowerShopContent;

	// Array Lists

	// Name
	private static String nameFlowerShop;
	// Weather
	private static int weather;
	private static final String[] WEATHER = { "Sunny", "Cloudy", "Windy", "Rainy", "Extreme Weather" };
	// Ratings
	private static double[] ratings;
	private static int numRatings;
	private static double averageRating;
	// Miscellaneous
	private static int money;
	private static int day;

	public FlowerShopV4() {

		// Set up the JFrame
		flowerShopWindow = new JFrame("Flower Shop Game");

		// Get the file path to the user's FlowerShop photo's folder
		filePathForPhotos = FlowerShopStoryV4.findFilePathForPhotos();
		filePathsForPhotos[FlrCmpV4.SUNNY_WEATHER_PHOTO] = filePathForPhotos + "\\FlowerShop_Sunny.png";
		filePathsForPhotos[FlrCmpV4.CLOUDY_WEATHER_PHOTO] = filePathForPhotos + "\\FlowerShop_Sunny.png";
		filePathsForPhotos[FlrCmpV4.WINDY_WEATHER_PHOTO] = filePathForPhotos + "\\FlowerShop_Sunny.png";
		filePathsForPhotos[FlrCmpV4.RAINY_WEATHER_PHOTO] = filePathForPhotos + "\\FlowerShop_Rainy.png";
		filePathsForPhotos[FlrCmpV4.EXTREME_WEATHER_PHOTO] = filePathForPhotos + "\\FlowerShop_Raiy.png";

		// Set up the JPanel
		flowerShopContent = new JPanel(new GridBagLayout());

		// Get and set the constraints for the window
		flowerShopConstraints = FlowerShopGridBagConstraintsV4.getFlowerShopConstraints();
		tempFlowerShopContent = FlowerShopContentV4.getFlowerShopContent();

		// Sets the static JPanel this.flowerShopContent inside of the method
		setFlowerShopContent(tempFlowerShopContent, flowerShopConstraints);

		// TODO set up flower array list

		// TODO set up customer array list

		// The weather always starts sunny
		weather = FlrCmpV4.SUNNY_WEATHER;

		// Start with $30
		money = 30;

		// Get the average rating. user starts with a five star rating.
		ratings = new double[100];
		ratings[0] = 5;
		numRatings = 1;
		averageRating = findAverageRating();

		// Get the new name of the flower shop
		nameFlowerShop = FlowerShopStoryV4.findFlowerShopName();

		// Weather always starts out sunny
		weather = FlrCmpV4.SUNNY_WEATHER;

		// User starts on day 1
		day = 1;

		// Set default window options
		flowerShopWindow.add(flowerShopContent);
		flowerShopWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flowerShopWindow.setSize(1400, 800);
		flowerShopWindow.setLocationRelativeTo(null);
		flowerShopWindow.setVisible(true);

		/**
		 * The user cannot change the window size. This code will prompt the user to
		 * change the window to the default size if they try to change the size.
		 */
		flowerShopWindow.addComponentListener(new ComponentAdapter() {

			// Ensures the user is not prompted upon opening the program
			private static boolean isFirstTimeOpeningProgram = true;
			// Prevents multiple occurrences of the dialog from popping up
			private static boolean isShowingConfirmDialog = false;

			@Override
			public void componentResized(ComponentEvent componentEvent) {

				if (isFirstTimeOpeningProgram) {
					isFirstTimeOpeningProgram = false;
				} else {
					if (!isShowingConfirmDialog) {

						isShowingConfirmDialog = true;

						int userChoice = JOptionPane.showConfirmDialog(flowerShopWindow,
								"Enter \"YES\" to change the window to the default size.\n The game works better at the default size.");

						boolean shouldResizeWindow = (userChoice == 0) ? true : false;

						if (shouldResizeWindow) {
							flowerShopWindow.setVisible(false);
							flowerShopWindow.setSize(1400, 800);
							flowerShopWindow.setVisible(true);
						}
						isShowingConfirmDialog = false;
					}

				}
			}
		});

	}

	public static void main(String[] args) {

		// Run the program

		FlowerShopV4 flowerShopDriver = new FlowerShopV4();
		System.out.println(flowerShopDriver); // Remove annoying yellow error

	}

	// getters
	/**
	 *
	 * @return String the filePathForPhotos
	 */
	protected static String[] getFilePathsForPhotos() {
		return FlowerShopV4.filePathsForPhotos;
	}

	/**
	 *
	 * @return JPanel[] the tempFlowerContent
	 */
	protected static JPanel[] getTempFlowerShopContent() {
		return FlowerShopV4.tempFlowerShopContent;
	}

	/**
	 *
	 * @return JFrame the flowerShopWindow
	 */
	protected static JFrame getFlowerShopWindow() {
		return FlowerShopV4.flowerShopWindow;
	}

	/**
	 *
	 * @return JPanel the flowerShopContent
	 */
	protected static JPanel getFlowerShopContent() {
		return FlowerShopV4.flowerShopContent;
	}

	/**
	 *
	 * @return String the nameFlowerShop
	 */
	protected static String getNameFlowerShop() {
		return FlowerShopV4.nameFlowerShop;
	}

	/**
	 *
	 * @return int the weather
	 */
	protected static int getWeather() {
		return FlowerShopV4.weather;
	}

	/**
	 *
	 *
	 * @return String current weather
	 */
	protected static String getStringWeather() {
		return FlowerShopV4.WEATHER[weather];
	}

	/**
	 *
	 * @return int the day
	 */
	protected static int getDay() {
		return FlowerShopV4.day;
	}

	/**
	 *
	 * @return int the money
	 */
	protected static int getMoney() {
		return FlowerShopV4.money;
	}

	/**
	 *
	 * @return int the numRatings
	 */
	protected static int getNumRatings() {
		return FlowerShopV4.numRatings;
	}

	/**
	 *
	 * @return double the averageRating
	 */
	protected static double getAverageRating() {
		return FlowerShopV4.averageRating;
	}

	// setters
	/**
	 *
	 * @param day the day to set
	 */
	protected static void setDay(int day) {
		FlowerShopV4.day = day;
	}

	/**
	 *
	 * @param weather the weather to set
	 */
	protected static void setWeather(int weather) {
		FlowerShopV4.weather = weather;
	}

	// Sub Methods
	protected static void setFlowerShopContent(JPanel[] tempFlowerShopContent,
			GridBagConstraints[] flowerShopConstraints) {

		/*-*
		 * I have test methods below. Everything surrounded by the TODO's can be deleted,
		 * once I finish creating the valid getFlowerShopContent method
		 */
		// @formatter:off Start uselessness buttons to test GridBagLayout TODO delete later
		JButton savedCustomerButton = new JButton("Saved Customer");
		JButton customersButton = new JButton("Customer");
		JButton friendsPreferencesButton = new JButton("Friends Preferences");
		JButton sellOptionsButton = new JButton("Sell Options");
		// JButton flowerShopButton = new JButton("Flower Shop");
		JButton flowerManagementButton = new JButton("Flower Options");
		// JButton statsButton = new JButton("Stats");
		JButton flowersButton = new JButton("Flower");
		// JButton endDayButton = new JButton("End Day");
		// Adding useless buttons to the content to test GridBagLayout
		tempFlowerShopContent[FlrCmpV4.SAVED_CUSTOMER_COMPONENT].add(savedCustomerButton, BorderLayout.CENTER);
		tempFlowerShopContent[FlrCmpV4.CUSTOMERS_COMPONENT].add(customersButton, BorderLayout.CENTER);
		tempFlowerShopContent[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT].add(friendsPreferencesButton, BorderLayout.CENTER);
		tempFlowerShopContent[FlrCmpV4.SELL_OPTIONS_COMPONENT].add(sellOptionsButton, BorderLayout.CENTER);
		// tempFlowerShopContent[FlrCmp.FLOWER_SHOP_COMPONENT].add(flowerShopButton, BorderLayout.CENTER);
		tempFlowerShopContent[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT].add(flowerManagementButton, BorderLayout.CENTER);
		// tempFlowerShopContent[FlrCmpV2.STATS_COMPONENT].add(statsButton, BorderLayout.CENTER);
		tempFlowerShopContent[FlrCmpV4.FLOWERS_COMPONENT].add(flowersButton, BorderLayout.CENTER);
		// tempFlowerShopContent[FlrCmpV2.END_DAY_COMPONENT].add(endDayButton,
		// BorderLayout.CENTER);
		// End uselessness TODO delete later @formatter:on

		//@formatter:off

		/*-*
		 * Adding gridbag constraints into the main flowerShopContent JPanel.
		 * Every line follow the basic GridBagLayout construction for JPanels. That is:
		 * content.add(thisButton, thisGridBagConstraint);
		 *
		 * Instead of using a for loop to accomplish this, I kept each line individual
		 * so the user can see what content is getting added in at each index
		 */
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.SAVED_CUSTOMER_COMPONENT],
				flowerShopConstraints[FlrCmpV4.SAVED_CUSTOMER_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.CUSTOMERS_COMPONENT],
				flowerShopConstraints[FlrCmpV4.CUSTOMERS_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT],
				flowerShopConstraints[FlrCmpV4.FRIEND_PREFERENCES_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.SELL_OPTIONS_COMPONENT],
				flowerShopConstraints[FlrCmpV4.SELL_OPTIONS_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.FLOWER_SHOP_COMPONENT],
				flowerShopConstraints[FlrCmpV4.FLOWER_SHOP_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT],
				flowerShopConstraints[FlrCmpV4.FLOWER_MANAGEMENT_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.STATS_COMPONENT],
				flowerShopConstraints[FlrCmpV4.STATS_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.FLOWERS_COMPONENT],
				flowerShopConstraints[FlrCmpV4.FLOWERS_COMPONENT]);
		flowerShopContent.add(tempFlowerShopContent[FlrCmpV4.END_DAY_COMPONENT],
				flowerShopConstraints[FlrCmpV4.END_DAY_COMPONENT]);
		//@formatter:on
	}

	/*-*
	 *
	 * This method revalidates the flowerShopWindow and flowerShopeWindow
	 * whenever an event that changes what is displayed occurs
	 *
	 * @param indexTempContentToRevalidate the location of the content being revalidated
	 * @param tempContentToRevalidate the actual content being revalidated
	 *
	 */
	protected static void revalidateFlowerShop(int indexTempContentToRevalidate, JPanel tempContentToRevalidate) {

		// Change the tempFlowerShopContent to the correct content
		tempFlowerShopContent[indexTempContentToRevalidate] = tempContentToRevalidate;

		// Add the new tempFlowerShopContent back into the normal content
		flowerShopContent.removeAll();
		setFlowerShopContent(tempFlowerShopContent, flowerShopConstraints);

		// Revalidate the normal content
		flowerShopContent.revalidate();
		flowerShopContent.repaint();
	}

	/**
	 * This method sums all current ratings and divides by numRatings
	 *
	 * @return double the averageRating
	 */
	private double findAverageRating() {
		double sumRatings = 0;
		for (int i = 0; i < ratings.length; i++) {
			sumRatings += ratings[i];
		}
		return sumRatings / numRatings;
	}

}
