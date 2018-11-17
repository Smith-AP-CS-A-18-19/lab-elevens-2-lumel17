/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	String ranks2[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jacks", "Queens", "Kings"};
	String suits2[] = {"Spades", "Clubs", "Hearts", "Diamonds"};
	int pointValue2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,};

	Deck e = new Deck(ranks2, suits2, pointValue2);

	for (int i = 0; i < ranks2.length; i++) {
		System.out.println(e.deal());
	}
	System.out.println(e.isEmpty());
	}
}
