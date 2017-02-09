/**
 * PRICING PLANS:
 * Package A: 9.95$/month for 10 hours. +hours are 2/per
 * Package B: 13.95/month 20 hours. +hours 1/per
 * Package C: 29.99/month unlimited
 */

import javax.swing.*;

public class ch3lab {
	public static void main(String[] args) {

		double totalCharge, hoursUsed; //double variables
		String paymentPlan, hoursUsedTemp; //string variable

		//get input
		paymentPlan = JOptionPane.showInputDialog("Which payment package do you have? A/B/C");
		hoursUsedTemp = JOptionPane.showInputDialog("How many hours of access did you use?");

		//parse double for hours used
		hoursUsed = Double.parseDouble(hoursUsedTemp);

		//check which package they have. if not A, B, or C, we will terminate the program. ABC can be lowercased too
		if(paymentPlan.toLowerCase().equals("a")) {
			//first check if over 10 hours.
			if(hoursUsed>10.0) {
				totalCharge = (9.95 + (hoursUsed * 2));
				JOptionPane.showMessageDialog(null, String.format("Total charge: $%.2f", totalCharge));
			} else {
				totalCharge = 9.95;
				JOptionPane.showMessageDialog(null, "Total charge: $9.95");
			}

			//now lets check how much money they would save by switching to either B or C
			double if_B = (13.95 +(hoursUsed * 1));
			double if_C = 29.99;

			double B_savings = (totalCharge - if_B);
			double C_savings = (totalCharge - if_C);


			String msg = String.format("Savings with Package A: $%.2f\nSavings with Package B: $%.2f", B_savings, C_savings);
			JOptionPane.showMessageDialog(null, msg);


		} else if(paymentPlan.toLowerCase().equals("b")) {
			//first check if over 20 hours
			if(hoursUsed>20.0) {
				totalCharge = (13.95 +(hoursUsed * 1));
				JOptionPane.showMessageDialog(null, String.format("Total charge: $%.2f", totalCharge));
			} else {
				totalCharge = 13.95;
				JOptionPane.showMessageDialog(null, "Total charge: $13.95");
			}

			double if_C = 29.99;
			double C_savings = (totalCharge - if_C);

			String msg = String.format("Savings with Package C: %.2f", if_C);
			JOptionPane.showMessageDialog(null, msg);

		} else if(paymentPlan.toLowerCase().equals("c")) {
			JOptionPane.showMessageDialog(null, "Total charge: $29.99");
		} else {
			JOptionPane.showMessageDialog(null, "INVALID OPTION!");
			System.exit(0);
		}





	}
}
