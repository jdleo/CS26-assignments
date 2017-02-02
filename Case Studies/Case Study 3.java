/**
The National Commerce Bank has hired you as a contract programmer. Your first assignment
is to write a class that will be used by the bank’s automated teller machines (ATMs)
to validate a customer’s personal identification number (PIN). Your class, which will be
named PinTester, will be incorporated into a larger program that asks the customer to
input his or her PIN on the ATM’s numeric keypad. (PINs are multi-digit numbers. The
program stores each digit in an element of an int array.) The program also retrieves a
copy of the customer’s actual PIN from a database, as an int array. If these arrays match,
then the customer’s identity is validated.
*/

import java.util.*;
import javax.swing.JOptionPane;

public class cs3 {
	
	

	public static void main(String[] args) {
		
		//test, will be user input later
		ArrayList<Integer> arr = new ArrayList<Integer>(
				Arrays.asList(1,2,7,2));
		
		PinTester pT = new PinTester();
		pT.setPinAttempt(arr);
		
		
		pT.testPin();
		
		
		
	}

}

class PinTester {
	
	//pin attempt private var
	private ArrayList<Integer> pinAttempt = new ArrayList<Integer>();
	
	//this is the real pin we are testing against
    ArrayList<Integer> realPin = new ArrayList<Integer>(
			Arrays.asList(1,5,7,2));
	
	//getter
	public ArrayList<Integer> getPinAttempt() {
		return pinAttempt;
	}

	//setter
	public void setPinAttempt(ArrayList<Integer> pinAttempt) {
		this.pinAttempt = pinAttempt;
	}
	
	public boolean testPin() {
		if (this.pinAttempt.equals(this.realPin)) {
			System.out.println(this.pinAttempt);
			System.out.println("Correct Pin");
			return true;
		} else {
			System.out.println(this.pinAttempt);
			System.out.println("Wrong Pin");
			return false;
		}
	}
	
	
	
	
}
