import javax.swing.*;
import java.util.*;



public class SlotMachine {

	/** this method calculates award from the three random strings and displays
	 *  @param amount of bet
	 *  @param word 1
	 *  @param word 2
	 *  @param word 3
	 */
	public static void play(double bet, String w1, String w2, String w3) {
		double bonus;

		if ( w1.equals(w2) && w2.equals(w3) ) {
			bonus = bet * 3;
		} else if ( w1.equals(w2) || w2.equals(w3) || w1.equals(w3) ) {
			bonus = bet * 2;
		} else {
			bonus = 0.00;
		}

		String msg = String.format("You won $%.2f!" , bonus);
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String[] args) {

		boolean cont = false; //flag for continuing the do-while loop
		double bet, runningTotal, deposit;
		String word1, word2, word3;
		char response;

		//OUTER LOOP.
		do {

			//get the bet
			bet = getBet();

			//select the 3 words
			word1 = picker(); word2 = picker(); word3 = picker();
			JOptionPane.showMessageDialog(null, String.format("%s, %s, %s", word1, word2, word3));

			//play the game
			play(bet, word1, word2, word3);

			//determine if they want to play again or not
			response = again();
			if (response == 'y') {
				cont = true;
			} else {
				cont = false;
			}

		} while (cont);

	}

	/** method for getting the bet
	 *  @return amount of bet
	 */
	public static double getBet() {
		String betInput = JOptionPane.showInputDialog("Enter the amount of bet:");
		double bet = Double.parseDouble(betInput);

		return bet;
	}

	/** method for generating random number 0-5 and returning fruit associated with it
	 *  @return the fruit string associated with the random num that was generated
	 */
	public static String picker() {
		Random ran = new Random();
		int choice = ran.nextInt(6);

		switch (choice) {
		case 0:
			return("Cherry");
		case 1:
			return("Orange");
		case 2:
			return("Plum");
		case 3:
			return("Melon");
		case 4:
			return("Bar");
		default:
			return("Apple");
		}

	}

	/** method for prompting user if they want to play again or not
	 *  @return the response as char
	 */

	public static char again() {
		String getInput = JOptionPane.showInputDialog("Do you want to play again?");
		getInput = getInput.toLowerCase();

		return getInput.charAt(0);
	}

}
