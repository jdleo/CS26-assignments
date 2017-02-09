package labs;
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
				totalCharge = (9.95 + ((hoursUsed-10) * 2));
				JOptionPane.showMessageDialog(null, String.format("Total charge: $%.2f", totalCharge));
			} else {
				totalCharge = 9.95;
				JOptionPane.showMessageDialog(null, "Total charge: $9.95");
			}

			//now lets check how much money they would save by switching to either B or C
			double if_B = (13.95 +(hoursUsed * 1));
			double B_savings;
			double if_C = 29.99;

			//check if we used under 20 hours to calculate B savings
			if (hoursUsed < 20) {
				B_savings = (totalCharge - if_B);
			} else {
				B_savings = (totalCharge - (if_B - 20));
			}
			
			double C_savings = (totalCharge - if_C);

			//check if savings are negative
			if ((B_savings < 0) && (C_savings < 0)) {
				//NO SAVINGS
				JOptionPane.showMessageDialog(null, "You have the most optimal plan. There were no savings with the other plans.");
			} else if(B_savings < 0) {
				//just b savings are negative, so just show user C savings
				String msg = String.format("Savings with Package C: $%.2f", C_savings);
				JOptionPane.showMessageDialog(null, msg);
			} else if(C_savings < 0) {
				//just c savings are negative, so just show user B savings
				String msg = String.format("Savings with Package B: $%.2f", B_savings);
				JOptionPane.showMessageDialog(null, msg);
			} else {
				//no negatives, display normal message
				String msg = String.format("Savings with Package B: $%.2f\nSavings with Package C: $%.2f", B_savings, C_savings);
				JOptionPane.showMessageDialog(null, msg);
			}
			


		} else if(paymentPlan.toLowerCase().equals("b")) {
			//first check if over 20 hours
			if(hoursUsed>20.0) {
				totalCharge = (13.95 +((hoursUsed-20) * 1));
				JOptionPane.showMessageDialog(null, String.format("Total charge: $%.2f", totalCharge));
			} else {
				totalCharge = 13.95;
				JOptionPane.showMessageDialog(null, "Total charge: $13.95");
			}

			double if_C = 29.99;
			double C_savings = (totalCharge - if_C);

			if (C_savings >= 0) {
				String msg = String.format("Savings with Package C: $%.2f", C_savings);
				JOptionPane.showMessageDialog(null, msg);
			} else {
				JOptionPane.showMessageDialog(null, "You have the most optimal payment plan. \nThere were no savings if you were to switch to Package C.");
			}
			

		} else if(paymentPlan.toLowerCase().equals("c")) {
			JOptionPane.showMessageDialog(null, "Total charge: $29.99");
		} else {
			JOptionPane.showMessageDialog(null, "INVALID OPTION!");
			System.exit(0);
		}

	}
}
