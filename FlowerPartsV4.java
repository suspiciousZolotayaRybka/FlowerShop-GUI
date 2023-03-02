/**
 * Contains constants used by Customer and Flower (inherited through Customer by Friend and Critic)
 *
 * Name: Finehout, Isaac CMIS 242/6384 Date: 2/23/2023
 *
 * @version FlowerShopV4
 * @author fineh
 */
package FinehoutIsaac_DiscWeek8;

public interface FlowerPartsV4 {

	// Declare final variables
	final String[] SIZE = { "Young ($)", "Young Adult ($$)", "Adult ($$$)", "Mature ($$$$)", "Old ($$$$$)" };
	final String[] COLORS = { "Pink", "Red", "Yellow", "Blue", "Orange" };
	final String[] BLOSSOMS = { "o", "@", "ф", "ぎ", "؟" };
	final String[] BLOSSOM_NAMES = { "American", "European", "Russian", "Japanese", "Middle-Eastern" };
	final String[] STEMS = { "│", "║", "◠", "△", "▞" };
	final String[] STEM_NAMES = { "Tulip", "Rose", "Marigold", "Peony", "Lily" };
	final String PINK = "\033[1;35m";
	final String RED = "\033[1;31m";
	final String YELLOW = "\033[1;33m";
	final String BLUE = "\033[1;34m";
	final String ORANGE = "\033[1;38;5;208m";
	final String RESET = "\033[0m";

}
