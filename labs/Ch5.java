/** @author John Leonardo */

import java.util.*;

public class Ch5_Lab {

	public static void main(String[] args) {
		
	}
	
	/** This method generates a random integer from 1-10
	    @return random integer in the range of 1 to 10
	 */
	public static int random() {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		return n;
	}
}
