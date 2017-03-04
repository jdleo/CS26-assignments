/** @author John Leonardo */

import java.util.*;
import javax.swing.JOptionPane;

public class Ch5_Lab {

	public static void main(String[] args) {
		final int months = 12; //constant for months
		int years; //int variable
		double rainfall; //double variable
		
		//generate random amount of years and display to user
		years = random();
		JOptionPane.showMessageDialog(null, years + " years.");
		
		//get rainfall with our method
		rainfall = getRainfall(years, months);
	}
	
	/** This method generates a random integer from 1-10
	    @return random integer in the range of 1 to 10
	 */
	public static int random() {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		return n;
	}
	
	/** This method loops through the given number of years & months
    	@return total rainfall
     */
	public static double getRainfall(int years, int months) {
		double totalRainfall = 0; //temporary variable for total rainfall
		
		//OUTER LOOP, loops through years
		for ( int i = 1; i <= years ; i++ ) {
			
			//INNER LOOP, loops through months
			for ( int j = 1; j <= months ; j++ ) {
				double rainfallThisMonth;
				
				//format our message to give the user, and get rainfall
				String msg = String.format("Enter the rainfall in inches "+
											"for year %s, month %s", i, j);
				//validate if not negative
				do {
					String rainfallInput = JOptionPane.showInputDialog(msg);
					rainfallThisMonth = Double.parseDouble(rainfallInput);
				} while (rainfallThisMonth < 0);
				
				totalRainfall += rainfallThisMonth;
				
			}
		}
		return totalRainfall; //return total rainfall
	}
	
	
}
