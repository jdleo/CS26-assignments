/**
 * @author John Leonardo
 * 2 pounds or less - 1.10
 * over 2 pounds , less than 6 pounds - 2.20
 * over 6 pounds , but less than 10 pounds - 3.70
 * 10 or more - 4.80
 * (per 500 miles)
 */

import javax.swing.*;

public class ch3_assignment {

	public static void main(String[] args) {
		
		//empty variables
		double weight, miles, shippingRate, shippingCost;
		
		String weightTemp, milesTemp; //temporary strings, until they get parsed to double
		
		//get user input and parse to double for both
		weightTemp = JOptionPane.showInputDialog("Enter the weight of the package (in pounds).");
		milesTemp = JOptionPane.showInputDialog("Enter how many miles it needs to be shipped.");
		weight = Double.parseDouble(weightTemp);
		miles = Double.parseDouble(milesTemp);
		
		//first check if weight/miles is negative or 0. if so, display message and terminate the program
		if (weight <= 0 || miles <= 0) {
			JOptionPane.showMessageDialog(null, "Invalid input. \n Please make sure both values are positive. \n Terminating program.");
			System.exit(0);
		}
		
		//round up weight to an int, and use switch to determine shipping rate
		switch ( (int) Math.ceil(weight) ) {
		case 1: case 2: //up to 2 pounds
			shippingRate = 1.10;
			break;
		case 3: case 4: case 5: case 6: //2-6 pounds
			shippingRate = 2.20;
			break;
		case 7: case 8: case 9: case 10: //6-10 pounds
			shippingRate = 3.70;
			break;
		default: //over 10
			shippingRate = 4.80;
			break;
		}
		
		//calculate shipping cost
		shippingCost = ( (Math.ceil(miles/500)) * shippingRate);
		
		//display total shipping cost to user	
		String msg = String.format("Your total shipping cost is: $%.2f", shippingCost);
		JOptionPane.showMessageDialog(null, msg);

	}

}
