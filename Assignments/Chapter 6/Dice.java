import java.util.Random;

/**
 * The Dice class simulates a six-sided die
 */
public class Dice {
	
	private int sides; //number of sides
	private int value; //the die's value
	
	/**
	 * The constructor performs an initial roll of the die.
	 * @param numSides
	 */
	public Dice(int numSides) {
		sides = numSides;
		roll();
	}
	
	/**
	 * This method simulates rolling a dice
	 */
	public void roll() {
		//create Random object
		Random r = new Random();
		
		//get random value
		value = r.nextInt(sides) + 1;
	}

	
	/**
	 * get sides
	 * @return sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * get value
	 * @return
	 */
	public int getValue() {
		return value;
	}
	
	
	
}
