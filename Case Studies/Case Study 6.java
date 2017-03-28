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
			String m = String.format("%s \n VALID", serialNumber);
			msg(m);
		} else {
			String m = String.format("%s \n INVALID", serialNumber);
			msg(m);
		}
	}
	
	/**
	 * Method for getting the serial number to test from the user
	 * @return returns the serial number from user
	 */
	public static String getSerial() {
		String sn = JOptionPane.showInputDialog("Enter the serial number you want to validate.\n"+
												"Must be in LLLLL-DDDD-LLLL format.");
		return sn.toUpperCase();
	}
	
	/**
	 * Method for validating the serial number
	 * @param sn
	 * @return returns true/false whether it's valid/invalid
	 */
	public static boolean validate(String sn) {
		//first and foremost check if the sn is 15 characters
		if (sn.length() == 15) {
			//next, check if it at least contains a hyphen
			if (sn.contains("-")) {
				//split the string up divided by hyphens
				String[] sets = sn.split("-");
				//next, check if there are three "sets" in the serial number
				if (sets.length == 3) {
					//next, check the format alphas-numerics-alphas (wrote a method for this)
					if (checkFormat(sets)) {
						return true;
					} else {
						msg("Serial number must be alpha-numeric-alpha format.");
						return false;
					}
				} else {
					msg("Serial number must have three sets divided by a hyphen");
					return false;
				}
			} else {
				msg("Serial number must have three hyphens");
				return false;
			}
			
		} else {
			msg("Serial number must have 15 characters in length.");
			return false;
		}
	}
	
	/**
	 * This method is to check if the code in LLLLL-DDDD-LLLL format is in a correct format.
	 * Meaning, the L's MUST be alphas, and the D's MUST be numerics.
	 * @param sets
	 * @return Returns true/false
	 */
	public static boolean checkFormat(String[] sets) {
		int score1 = 0; //first set must have a validity score of 5
		int score2 = 0; //must be 4
		int score3 = 0; //must be 4
		
		String set1 = sets[0];
		String set2 = sets[1];
		String set3 = sets[2];
		
		for (int i = 0; i <= set1.length()-1; i++) {
			if ( Character.isLetter(set1.charAt(i)) ) {
				score1 += 1;
			}
		}
		
		for (int i = 0; i <= set2.length()-1; i++) {
			if ( Character.isDigit(set2.charAt(i)) ) {
				score2 += 1;
			}
		}

		for (int i = 0; i <= set3.length()-1; i++) {
			if ( Character.isLetter(set3.charAt(i)) ) {
				score3 += 1;
			}
		}
		
		if (score1 == 5 && score2 == 4 && score3 == 4) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Just a reusable method for displaying JOptionPane messages
	 * @param m
	 */
	public static void msg(String m) {
		JOptionPane.showMessageDialog(null, m);
	}

}
