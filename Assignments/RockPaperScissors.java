/** @author John Leonardo */

import java.util.*; //for random

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
}
