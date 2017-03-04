/** @author John Leonardo */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;

public class Ch5_Lab {

	public static void main(String[] args) throws FileNotFoundException {
		final int months = 12; //constant for months
		int years; //int variable
		double rainfall; //double variable
		
		//generate random amount of years and display to user
		years = random();
		JOptionPane.showMessageDialog(null, years + " years.");
		
		//get rainfall with our method
		rainfall = getRainfall(years, months);
		
		//calculate, display, and write
		calculateDisplayWrite(years, months, rainfall);
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
    	@param years as int
    	@param months as int
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
	
	/** This method calculates everything, displays it, and writes it to txt file
		@param years as int
		@param months as int
		@param total rainfall as double
	        @throws FileNotFoundException 
	 */
	public static void calculateDisplayWrite(int years, int months, double rainfall) 
			throws FileNotFoundException {
		//make calculations
		int totalMonths = ( years * months );
		double averageRainfall = ( rainfall / totalMonths );
		
		//format our string
		String resultMsg = String.format("Total number of months: %s \n"+
										 "Total rainfall: %.2f inches \n"+
										 "Average rainfall: %.2f inches",
										  totalMonths, rainfall, averageRainfall);
		
		//display message
		JOptionPane.showMessageDialog(null, resultMsg);
		
		//write result msg to txt file
		PrintWriter writer = new PrintWriter("rainfall.txt");
		writer.println(resultMsg);
		writer.close();
		
	}
}
