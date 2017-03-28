/**
 * Software for validating serial numbers.
 * A valid serial number is LLLLL-DDDD-LLLL where L are alpha chars and D are numeric chars
 * @author jdleo
 */

import javax.swing.JOptionPane;

public class CaseStudy6 {

	public static void main(String[] args) {
		String serialNumber;
		boolean valid;
		
		//get the serial number we are trying to validate
		serialNumber = getSerial();
		
		//validate the serial number
		valid = validate(serialNumber);
		
		//display appropriate message to user
		if (valid) {
			String m = String.format("%s \n -----VALID-----", serialNumber);
			JOptionPane.showMessageDialog(null, m);
		} else {
			String m = String.format("%s \n -----INVALID-----", serialNumber);
			JOptionPane.showMessageDialog(null, m);
		}
	}
	
	/**
	 * Method for getting the serial number to test from the user
	 * @return returns the serial number from user
	 */
	public static String getSerial() {
		String sn = JOptionPane.showInputDialog("Enter the serial number you want to validate.\n"+
												"Must be in LLLLL-DDDD-LLLL format.");
		return sn;
	}
	
	/**
	 * Method for validating the serial number
	 * @param sn
	 * @return returns true/false whether it's valid/invalid
	 */
	public static boolean validate(String sn) {
		return false;
	}

}
