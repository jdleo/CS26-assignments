import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CaseStudy4 {

	public static void main(String[] args) {
		//empty arrays
		ArrayList<String> emp_names = new ArrayList<String>();
		ArrayList<Double> emp_payRate = new ArrayList<Double>();
		ArrayList<Double> payouts = new ArrayList<Double>();
		
		emp_names = getNames(getCount());
		
		
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

}

