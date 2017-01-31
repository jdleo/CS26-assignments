/*
The loan officer at one of the Central Mountain Credit Union’s branch offices has asked
you to write a loan amortization application to run on her desktop PC. The application
should allow the user to enter the amount of a loan, the number of years of the loan, and
the annual interest rate. An amortization report should then be saved to a text file

Payment = (loan x rate/12 x term) / term - 1
Loan = the amount of the loan
Rate = the annual interest rate
Term = (1 + Rate/12)^Years x 12

*/

import javax.swing.JOptionPane;
import java.io.*;

public class cs2 {

	public static void main(String[] args) {
		
		//some variables for I/O
		String path;
		boolean append = false;
		
		//greeting and getting loan amount
		String name = JOptionPane.showInputDialog("What is your name?");
		String loanString = JOptionPane.showInputDialog(String.format("Hello, %s. Please enter your loan amount.", name));
		
		//parse loan to double
		double loanAmount = Double.parseDouble(loanString);
		
		//get interest rate
		String rateString = JOptionPane.showInputDialog("Enter the interest rate.");
		double interestRate = Double.parseDouble(rateString);
		
		//get years
		String yearsString = JOptionPane.showInputDialog("How many years do you want the loan for?");
		double years = Double.parseDouble(yearsString);	
		
	}

}
