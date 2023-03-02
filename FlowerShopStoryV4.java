package FinehoutIsaac_DiscWeek8;

/**
 *
 * Contains any major text or Story Options in FlowerShop
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class FlowerShopStoryV4 {

	protected static String findFilePathForPhotos() {

		boolean isChoosingFilePathForPhotos = true;

		do {

			String filePathForPhotos = null;

			try {
				filePathForPhotos = JOptionPane.showInputDialog(FlowerShopV4.getFlowerShopWindow(),
						"Copy and paste the path location for the folder with Photos (ie: C:\\Users\\fineh\\OneDrive\\Desktop\\FlowerShop )");
				if (filePathForPhotos == null) {
					throw new IllegalArgumentException("You must enter a file path.");
				}
				filePathForPhotos = removeQuotes(filePathForPhotos);
				// If the file the user chose does not exist,
				// Throw FileNotFoundException
				if (!((new File(filePathForPhotos)).exists())) {
					throw new FileNotFoundException(filePathForPhotos + " - Invalid File Path");
				}

			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(FlowerShopV4.getFlowerShopWindow(), "You must enter a file path.");

				StackTraceElement[] stackTraceElements = e.getStackTrace();
				System.out.printf("Class%sFile%sLine%sMethod%n", "\t".repeat(5), "\t".repeat(3), "\t".repeat(2));
				for (StackTraceElement element : stackTraceElements) {
					System.out.printf("%s\t%s\t%s\t%s%n", element.getClass(), element.getFileName(),
							element.getLineNumber(), element.getMethodName());
				}

			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(FlowerShopV4.getFlowerShopWindow(),
						"The file path you entered does not exist.\nPlease try again");

				StackTraceElement[] stackTraceElements = e.getStackTrace();
				System.out.printf("Class%sFile%sLine%sMethod%n", "\t".repeat(5), "\t".repeat(3), "\t".repeat(2));
				for (StackTraceElement element : stackTraceElements) {
					System.out.printf("%s\t%s\t%s\t%s%n", element.getClass(), element.getFileName(),
							element.getLineNumber(), element.getMethodName());
				}

			} finally {

				if ((filePathForPhotos != null) && new File(filePathForPhotos).exists()) {
					// Add the image to a dialog box and ask the user if they can see it.
					// Have them reenter a different file path if they cannot.
					ImageIcon flowerShopImageTest = new ImageIcon(filePathForPhotos + "\\FlowerShop_Sunny.png");
					JLabel flowerShopImageTestLabel = new JLabel(flowerShopImageTest);
					JLabel confirmMessage = new JLabel("Do you see an image of a Flower Shop?");
					JPanel confirmContent = new JPanel(new BorderLayout());
					confirmContent.add(flowerShopImageTestLabel, BorderLayout.CENTER);
					confirmContent.add(confirmMessage, BorderLayout.SOUTH);
					int userConfirmation = JOptionPane.showConfirmDialog(FlowerShopV4.getFlowerShopWindow(),
							confirmContent);

					// A ternary expression matching user confirmation to boolean
					isChoosingFilePathForPhotos = userConfirmation == 0 ? false : true;
					if (!isChoosingFilePathForPhotos) {
						return filePathForPhotos;
					}
				}

			}
		} while (isChoosingFilePathForPhotos);
		// TODO implement the getFileName methods into the two (ComponentFlowerShopV3 &
		// ComponentEndDayV3) where needed

		return "ERROR";
	}

	/**
	 * Sometimes windows copies file paths with quotes. If this happens, the
	 * recursive statement below removes the quotes.
	 *
	 * @param filePath
	 * @return String filePath the filePath without quotes
	 */
	private static String removeQuotes(String filePath) {

		for (int i = 0; i < filePath.length(); i++) {

			// See if the recursive statement has reached the end of the String
			// Exit if it has
			if (i == (filePath.length() - 1)) {
				// If the very last char is a quotation mark, remove it
				if (filePath.charAt(i) == '"') {
					return filePath.substring(0, filePath.length() - 1);
				}
				// Else, return the String
				return filePath;
			}

			// If it is not the end of the String, check to see if the char is a quote
			if (filePath.charAt(i) == '"') {
				return removeQuotes(filePath.substring(0, i) + filePath.substring(i + 1, filePath.length()));
			}
			// If it doesn't have quotes, continue into the next index of the for loop
		}
		return "ERROR";
	}

	/**
	 * Checks to see if the user entered a string under 20 characters. Contains a
	 * confirmation for the user's flower shop name. Preconditions for
	 * flowerShopName are that it must be greater than 20 characters, and it cannot
	 * be null, void, or empty.
	 *
	 * @return the name of the flower shop
	 */
	protected static String findFlowerShopName() {

		String nameFlowerShop = null;
		boolean isChoosingNameFlowerShop = true;

		while (isChoosingNameFlowerShop) {
			try {
				nameFlowerShop = JOptionPane.showInputDialog(
						"Your grandparents left you a flower shop in your will.\n\nWhat is your new flower shop's name?");

				// Throw an exception if the name is illegal
				if ((nameFlowerShop == null) || (nameFlowerShop.length() > 20) || nameFlowerShop.isBlank()
						|| nameFlowerShop.isEmpty()) {
					throw new IllegalNameFlowerShopException(nameFlowerShop);

					// Confirm the user's choice if the name is legal
				} else {

					int userConfirmation = JOptionPane.showConfirmDialog(FlowerShopV4.getFlowerShopWindow(),
							String.format("Are you sure you want to choose %s?%nYou can't change this later.",
									nameFlowerShop));

					// A ternary expression matching user confirmation to boolean
					isChoosingNameFlowerShop = userConfirmation == 0 ? false : true;

				}
			} catch (IllegalNameFlowerShopException e) {

				JOptionPane.showMessageDialog(FlowerShopV4.getFlowerShopWindow(), e);

			}
		}
		return nameFlowerShop;
	}

	/**
	 * An IllegalArgumentException subclass for nameFlowerShop
	 */
	private static class IllegalNameFlowerShopException extends IllegalArgumentException {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String msg;

		public IllegalNameFlowerShopException(String nameFlowerShop) {
			if (nameFlowerShop == null) {
				msg = "The name of the flower shop cannot be null.";
			} else if (nameFlowerShop.length() > 20) {
				msg = "The name of the flower shop must be under 20 characters.";
			} else if (nameFlowerShop.isEmpty()) {
				msg = "The name of the flower shop cannot be empty";
			} else if (nameFlowerShop.isBlank()) {
				msg = "The name of the flower shop cannot be blank.";
			} else {
				msg = "UNEXPECTED ERROR";
			}
		}

		@Override
		public String toString() {
			return this.getClass().getSimpleName() + ": " + msg;
		}

	}

}
