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
		
		//variables for payment calc
		double term, payment, balance;
		int numberOfPayments;
		
		//greeting and getting loan amount
		String name = JOptionPane.showInputDialog("What is your name?");
		String loanString = JOptionPane.showInputDialog(String.format("Hello, %s. Please enter your loan amount.", name));
		
		//parse loan to double
		double loanAmount = Double.parseDouble(loanString);
		
		//initial balance will be the same as loan amount, obvi
		balance = loanAmount;
		
		//get interest rate
		String rateString = JOptionPane.showInputDialog("Enter the interest rate.");
		double interestRate = Double.parseDouble(rateString);
		
		//get years
		String yearsString = JOptionPane.showInputDialog("How many years do you want the loan for?");
		double years = Double.parseDouble(yearsString);	
		
		term = Math.pow((1+interestRate/12.0), (12.0 * years));
		payment = (loanAmount * interestRate/12.0 * term) / (term - 1);
		numberOfPayments = 12 * (int)years;
		System.out.println(String.format("Monthly payment: $%.2f", payment));
		
		for (int currentMonth = 1;currentMonth <= numberOfPayments;currentMonth = currentMonth + 1) {
			double principal;
			double thisMonthInterest = interestRate / 12.0 * balance;
			if (currentMonth != numberOfPayments) {
				principal = payment - thisMonthInterest;
			} else {
				principal = balance;
				payment = balance + thisMonthInterest;
			}
			balance -= (principal);
			String paymentLine = String.format("Month %s | Interest: $%.2f | Principal: $%.2f | Balance: $%.2f", currentMonth, thisMonthInterest, principal, balance);
			System.out.println(paymentLine);
		}	
	}
}
