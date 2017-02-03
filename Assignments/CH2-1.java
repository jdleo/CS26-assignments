/**
Design a program that will ask the user to enter the amount of a purchase.
The program should then compute the state sales tax and the county sales tax. 
Assume the state sales tax is 4 percent of the purchase amount, the county sales
tax is 2 percent of the purchase amount. The program should display the amount of
the purchase, the state sales tax, the county sales tax, the total sales tax,
and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
Hint: Use 0.04 for 4 percent, 0.02 for 2 percent in the calculation.
*/

/**
Design a program that will ask the user to enter the amount of a purchase.
The program should then compute the state sales tax and the county sales tax. 
Assume the state sales tax is 4 percent of the purchase amount, the county sales
tax is 2 percent of the purchase amount. The program should display the amount of
the purchase, the state sales tax, the county sales tax, the total sales tax,
and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
Hint: Use 0.04 for 4 percent, 0.02 for 2 percent in the calculation.
*/

import javax.swing.JOptionPane; //we're using JOptionPane for input/output interface

public class ch2_assignment1 {

	public static void main(String[] args) {
		
		//empty variables
		double purchaseAmount, stateTax, countyTax, totalSale;
		String purchaseAmountTemp, resultMsg;
		
		//constants
		final double state_sales_tax = 0.04;
		final double county_sales_tax = 0.02;
		
		//get user input
		purchaseAmountTemp = JOptionPane.showInputDialog("Enter the purchase amount: ");
		
		//parse temporary string to DOUBLE
		purchaseAmount = Double.parseDouble(purchaseAmountTemp);
		
		//make calculations
		stateTax = (purchaseAmount * state_sales_tax);
		countyTax = (purchaseAmount * county_sales_tax);
		totalSale = (purchaseAmount + stateTax + countyTax);
		
		//format the result message
		resultMsg = String.format("Initial Purchase Amount: $%s\nState Sales Tax: $%s\nCounty Sales Tax: $%s\n Total of the Sale: $%s", 
				purchaseAmount, stateTax, countyTax, totalSale);
		
		//display result to USER
		JOptionPane.showMessageDialog(null, resultMsg);
	}

}

