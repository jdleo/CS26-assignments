/** @author John Leonardo */

import java.util.*; //for random
import javax.swing.*; //for JOptionPane

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * This method generates a random integer between 1-3
	 * @return returns the random int
	 */
	public static int random() {
		//generate random int between 1-3 and return it
		Random rand = new Random();
		return rand.nextInt(3) + 1;
	}
	
	/**
	 * This method allows the user to pick Rock, Paper, or Scissors
	 * @return returns the equivalent int for the choice
	 */
	public static int picker() {
		String choice = JOptionPane.showInputDialog("Rock, Paper, or Scissors?"+
													"\n You can use r,p, or s");
		char choiceChar = choice.toLowerCase().charAt(0);
		switch (choiceChar) {
		case 'r':
			return 1;
		case 'p':
			return 2;
		case 's':
			return 3;
		default:
			JOptionPane.showMessageDialog(null,"Invalid choice");
			return -1;
		}
		
	}
}
