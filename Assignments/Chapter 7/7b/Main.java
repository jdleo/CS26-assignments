import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//arrayList for holding our PhoneBookEntry objects
		ArrayList<PhoneBookEntry> entries = new ArrayList<PhoneBookEntry>();
	
		//display intro message
		JOptionPane.showMessageDialog(null, "Welcome to the PhoneBook Entry System.\n"
											+"Enter a 0 at any time to terminate the program.\n"+
											"For phone numbers, you can only use digits, or it will crash.");
		//temporary variable to check if we should quit or not
		long input = 0;
		int count = 1;
		do {
			String name = JOptionPane.showInputDialog("Enter the name for person #" + count);
			String tempNumber = JOptionPane.showInputDialog("Enter the number for person #" + count);
			
			long number = Long.parseLong(tempNumber);
			input = number;
			
			//create PhoneBookEntry object
			PhoneBookEntry entry = new PhoneBookEntry(name, number);
			
			//add object to array
			entries.add(entry);
			
			count +=1;
			
		} while (input != 0);
		
		//enhanced for-loop to loop thru arrayList and display all objects
		for (PhoneBookEntry entry: entries) {
			entry.display();
		}
		
	}
}
