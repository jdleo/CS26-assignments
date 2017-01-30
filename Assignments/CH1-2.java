/*
A program that calculates a customer's bank account balance
A program that calculates the current balance in a savings account must ask the user for the followings:
1. the starting balance this month
2. the total amount of deposits made this month
3. the total amount of withdrawal made this month
4. the monthly interest rate
Once the program calculates the current balance, it will be displayed on the screen
*/
import java.util.Scanner;

public class ch1_2 {

	public static void main(String[] args) {
		//scanner init
		Scanner sc = new Scanner(System.in);
		
		//variables
		double startingBalance, totalDeposits, totalWithdraws, interest, finalBalance;
		
		//get all the information we need from user
		System.out.println("What was the starting balance this month?: ");
		startingBalance = sc.nextDouble();
		
		System.out.println("What was the total amount of deposits this month?: ");
		totalDeposits = sc.nextDouble();
		
		System.out.println("What was the total amount of withdraws this month?: ");
		totalWithdraws = sc.nextDouble();
		
		System.out.println("What is your interest rate?: ");
		interest = sc.nextDouble();
		
		//make calculations
		finalBalance = (startingBalance-totalWithdraws+totalDeposits);
		finalBalance = (finalBalance*interest) + finalBalance;
		
		//show final balance to user
		System.out.printf("Final balance: $%s",finalBalance);
		

	}

}
