import javax.swing.*;
import java.util.*;



public class SlotMachine {

	/** this method calculates award from the three random strings and displays
	 *  @param amount of bet
	 *  @param word 1
	 *  @param word 2
	 *  @param word 3
	 */
	public static double play(double bet, String w1, String w2, String w3) {
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
		
		return bonus;
	}

	public static void main(String[] args) {

		boolean cont = false; //flag for continuing the do-while loop
		double bet, balance;
		String word1, word2, word3;
		char response;
		
		//validate initial deposit amount with while{ try-catch }
		while (true) {
			String depositInput = JOptionPane.showInputDialog("Enter your initial deposit amount");
			try {
				balance = Double.parseDouble(depositInput);
				break;
				
			} catch (NumberFormatException ignore) {
				JOptionPane.showMessageDialog(null, "Invalid number");
			}
		}
		
		//OUTER LOOP.
		do {

			//get the bet, but validate its not more than balance
			do {
				bet = getBet();
			} while (bet < 0 || bet > balance);
			balance -= bet;
			
			//select the 3 words
			word1 = picker(); word2 = picker(); word3 = picker();
			
			// ***TO DO: REPLACE THIS DIALOG, WITH THE THREE IMAGES INSTEAD
			JOptionPane.showMessageDialog(null, String.format("%s, %s, %s", word1, word2, word3));
			display(word1, word2, word3);
			

			//play the game
			balance += play(bet, word1, word2, word3);
			
			//display current balance
			JOptionPane.showMessageDialog(null, String.format("Balance: $%.2f", balance));

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
		String getInput = JOptionPane.showInputDialog("Do you want to play again? Y/N?");
		getInput = getInput.toLowerCase();

		return getInput.charAt(0);
	}
	
	/** method for displaying the three slot images
	 *  @param all parameters are the image strings
	 */
	public static void display(String w1, String w2, String w3) {
		
		HashMap<String, String> h = new HashMap<String, String>() {{
			put("Cherry", "src/cherry.png");
			put("Orange", "src/orange.png");
			put("Plum", "src/plum.png");
			put("Melon", "src/melon.png");
			put("Bar", "src/bar.png");
			put("Apple", "src/apple.png");
		}};
		
		ImageIcon icon1 = new ImageIcon(h.get(w1));
        JOptionPane.showMessageDialog(null, w1,
                "Slot 1", JOptionPane.INFORMATION_MESSAGE, icon1);
        
        ImageIcon icon2 = new ImageIcon(h.get(w2));
        JOptionPane.showMessageDialog(null, w2,
                "Slot 2", JOptionPane.INFORMATION_MESSAGE, icon2);
        
        ImageIcon icon3 = new ImageIcon(h.get(w3));
        JOptionPane.showMessageDialog(null, w3,
                "Slot 3", JOptionPane.INFORMATION_MESSAGE, icon3);
		
	}
	

}
