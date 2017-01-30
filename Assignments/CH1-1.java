/*
a program that calculates the total of a retail sale should ask the user for the following:
1. the retail price of the item being purchased
2. the sales tax rate
Once these items have been entered, the program should calculate and display the following:
1. the sales tax for the purchase
2. the total of the sale
 */

import java.util.Scanner;

public class ch1_1 {

	public static void main(String[] args) {
		//scanner init
		Scanner sc = new Scanner(System.in);
		
		//variables
		double retailPrice, taxRate, salesTax, totalSale;
		
		//get the retail price
		System.out.println("Enter the retail price for the item: ");
		retailPrice = sc.nextDouble();
		
		//get tax rate
		System.out.println("Enter the sales tax rate: ");
		taxRate = sc.nextDouble();
		
		//calculate salesTax and total price
		salesTax = (taxRate * retailPrice);
		totalSale = (salesTax + retailPrice);
		
		//display total to user
		System.out.printf("The sales tax was $%s and the total cost of the item after tax is $%s", salesTax, totalSale);
		
	}

}
