/*
1. Ask the user to enter the salesperson’s monthly sales.
2. Ask the user to enter the amount of advanced pay.
3. Use the amount of monthly sales to determine the commission rate.
4. Calculate the commission.
5. Calculate the salesperson’s pay by subtracting the amount of advanced pay from the
commission. If the amount is negative, the salesperson must reimburse the company
*/

package test1;

import javax.swing.JOptionPane;

public class Tutorial1 {
	public static void main(String[] args) {
		//variables
		String input;
		double sales;
		double rate;
		double commission;
		double advance;
		double totalPay;
		
		//get monthly sales
		input = JOptionPane.showInputDialog("Enter your total sales this month");
		
		//original input was string so we'll parse it to double
		sales = Double.parseDouble(input);
		
		//determine rate
		if (sales<= 0) {
			JOptionPane.showMessageDialog(null, "Your input was invalid. Sales must be greater than 0.");
		} else if(sales<10000) {
			rate = 0.05;
		} else if(sales<15000) {
			rate = 0.10;
		} else if(sales<18000) {
			rate = 0.12;
		} else if (sales<22000) {
			rate = 0.15;
		} else {
			rate = 0.16;
		}
	}
}
