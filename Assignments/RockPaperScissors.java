/** @author John Leonardo */

import java.util.*; //for random
import javax.swing.*; //for JOptionPane

public class RockPaperScissors {

	public static void main(String[] args) {
		//flag for determining if the game is a tie or not
		boolean isTie = true;
		
		//as long as it's a tie, continue
		do {
			//user choice
			int userChoice = picker();
			//computer choice
			int computerChoice = random();
			
			//this assigns isTie variable, and determines winner
			isTie = determineWinner(userChoice, computerChoice);
			
		} while (isTie);
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
			JOptionPane.showMessageDialog(null,"Invalid choice. Terminating.");
			return -1; //this will be our value for an invalid choice
		}
	}
	
	/**
	 * This method determines the winner, or if it's a tie
	 * @param Parameter 1: int value for user choice
	 * @param Parameter 2: int value for computer choice
	 * @return returns a boolean for our tie flag in main()
	 */
	public static boolean determineWinner(int userChoice, int computerChoice) {
		//1 is rock, 2 is paper, 3 is scissors, -1 for invalid input
		//first check if our user gave us invalid input
		if (userChoice == -1) {
			System.exit(0);
		}
		
		//determine winner or tie
		if (userChoice == computerChoice) {
			JOptionPane.showMessageDialog(null, "TIE! Play again");
			return true;
		} else if ((userChoice == 1 && computerChoice == 2) ||
				   (userChoice == 2 && computerChoice == 3) ||
				   (userChoice == 3 && computerChoice == 1)) {
			//ALL LOSING CASES ^^^
			JOptionPane.showMessageDialog(null, "You lost!");
			return false;
		} else {
			//winner
			JOptionPane.showMessageDialog(null, "You won!");
			return false;
		}	
	}	
}
