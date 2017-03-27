/**
 * DEMONSTRATING PARALLEL ARRAYS IN JAVA
 * @author jdleo
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CaseStudy4 {

	public static void main(String[] args) {
		//empty arrays
		ArrayList<String> emp_names = new ArrayList<String>();
		ArrayList<Double> emp_payRate = new ArrayList<Double>();
		
		//get employee names
		emp_names = getNames(getCount());
		
		//get employee pay rates
		emp_payRate = getPayRates(emp_names);
		
		//display how much each user got paid for the month (assuming 40 hrs/week)
		showPayouts(emp_names, emp_payRate);
	}
	
	/**
	 * This method gets the amount of employees from the user.
	 * @return the amount of employees that the user has
	 */
	public static int getCount() {
		String temp = JOptionPane.showInputDialog("How many employees are there?");
		int count = Integer.parseInt(temp);
		return count;
	}
	
	/**
	 * This method gets the names of the employees from the user.
	 * @param nameCount
	 * @return Returns the employee names in ArrayList format
	 */
	public static ArrayList getNames(int nameCount) {
		ArrayList<String> names = new ArrayList<String>();
		for ( int i = 1 ; i <= nameCount ; i++ ) {
			String prompt = String.format("Enter the name for employee #%s", i);
			String name = JOptionPane.showInputDialog(prompt);
			names.add(name);
		}
		
		return names;
	}
	
	/**
	 * This method gets the pay rates for every employee addressed by name
	 * @param nameList
	 * @return Returns an array of pay rates of type Double
	 */
	public static ArrayList getPayRates(ArrayList nameList) {
		ArrayList<Double> payRates = new ArrayList<Double>();
		for ( int i = 0 ; i < nameList.size() ; i++) {
			String prompt = String.format("What is the hourly pay rate for %s?", nameList.get(i));
			String temp = JOptionPane.showInputDialog(prompt);
			double payRate = Double.parseDouble(temp);
			payRates.add(payRate);
		}
		return payRates;
	}
	
	/**
	 * This method calculates and displays the payouts for every employee
	 * @param nameList
	 * @param payRates
	 */
	public static void showPayouts(ArrayList nameList, ArrayList payRates) {
		//assuming each employee worked 40 hours a week for now
		final double weekly_hours = 40.0;
		final double monthly_hours = weekly_hours * 4;
		
		for ( int i = 0 ; i < nameList.size() ; i++ ) {
			String employeeName = (String)nameList.get(i);
			double weeklyPay = (double)payRates.get(i) * weekly_hours;
			double monthlyPay = (double)payRates.get(i) * monthly_hours;
			double annualPay = monthlyPay * 12.0;
			
			String prompt = String.format("%s : Weekly: $%.2f Monthly: $%.2f Annual: $%.2f",
											employeeName,weeklyPay,monthlyPay,annualPay);

			System.out.println(prompt);
		}
		
	}

}
