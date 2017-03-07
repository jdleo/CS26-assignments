/** @author John Leonardo */

import java.util.*; //for random
import javax.swing.*; //for JOptionPane

public class RockPaperScissors {

	public static void main(String[] args) {
		//user choice
		int userChoice = picker();
		
		//computer choice
		int computerChoice = random();
		
		
		
	}
	
	/**
	 * This method generates a random integer between 1-3, and displays choice
	 * @return returns the random int
	 */
	public static int random() {
		//generate random int between 1-3, display and return it
		Random rand = new Random();
		int randInt = rand.nextInt(3) + 1;
		
		//display what the computer chose, using switch statement
		switch (randInt) {
		case 1:
			JOptionPane.showMessageDialog(null, "Computer chose Rock");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Computer chose Paper");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Computer chose Scissors");
			break;
		}
		
		return randInt;
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
			return 1; //rock
		case 'p':
			return 2; //paper
		case 's':
			return 3; //scissors
		default:
			JOptionPane.showMessageDialog(null,"Invalid choice");
			return -1; //this will be our value for an invalid choice
		}
	}
	
}
