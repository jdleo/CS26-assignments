/**
 * @author John Leonardo
 */

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		//array for names of rewards, corresponding to dice roll (7 sided dice)
		String items[] = {"Shark","Huge Trout","Small fish","Beer Can","Dead Body","Medium Bass","Nothing"};
		
		//starting points of 0
		int totalPoints = 0;
		
		//boolean flag to decide if the user wants to keep playing
		boolean keepPlaying = true; //default value of true
		
		// --- MAIN --- //
		JOptionPane.showMessageDialog(null, "Welcome to the Fishing Game! Press OK to roll!");
		while (keepPlaying) {
			Dice dice = new Dice(7);
			
			int itemIndex = dice.getValue();
			String itemName = items[itemIndex-1];
			int pointsEarned = calculatePoints(itemIndex);
			
			totalPoints += pointsEarned;
			
			String prompt = String.format("You caught a %s, which is worth %s points \n "+
										  "You now have %s points.", itemName, pointsEarned, totalPoints);
			
			JOptionPane.showMessageDialog(null, prompt);
			
			//get response from user, to decide if we keep playing
			String response = JOptionPane.showInputDialog("Do you want to keep playing? \n"
														+ "any word starting with 'y' means yes, any other word means no");
			
			keepPlaying = playAgain(response);
		}
		// --- END MAIN --- //

	}
	
	
	/**
	 * This method takes the roll integer, and gives us the points that earned
	 * @param roll
	 * @return points
	 */
	public static int calculatePoints(int roll) {
		switch (roll) {
			case 1: return 15; //shark: 15 points
			case 2: return 10; //huge trout: 10 points
			case 3: return 2; //small fish: 2 points
			case 4: return -2; //beer can: -2 points
			case 5: return -30; //dead body: -30 points
			case 6: return 5; //medium bass: 5 points
			default: return 0; //nothing: 0 points
		}
	}
	
	/**
	 * This method is used to check if the user wants to play again.
	 * any word starting with "y" means yes, any other value means no
	 * @param response
	 * @return true or false
	 */
	public static boolean playAgain(String response) {
		char responseChar = response.toLowerCase().charAt(0);
		if (responseChar == 'y') {
			return true;
		} else {
			return false;
		}
	}

}
