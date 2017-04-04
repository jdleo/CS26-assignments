
import java.util.Scanner;

public class POS {

	public static void main(String[] args) {	
		//get username from user using getUsername() method
		String username = getUsername();
		
		//show instructions to user using instructions() method
		instructions(username);
		
		//get the subtotal using getSubTotal() method
		double subtotal = getSubtotal(username);
		
	}
	
	/**
	 * Method for getting the name of the user
	 * @return returns string
	 */
	public static String getUsername() {
		Scanner sc = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("| Maggie's POS Checkout System v. 1.0 |");
		System.out.println("+-------------------------------------+");
		
		System.out.println("Hi. Welcome to Maggie's! Please enter your name: ");
		
		return sc.nextLine();
	}
	
	/**
	 * Method for showing the instructions to the user
	 * @param username
	 */
	public static void instructions(String username) {
		String prompt = String.format("Okay, %s, enter the price of each item in dollars and cents and hit the ENTER key. \n"+
									  "For example, if your item costs $5.99, you would enter 5.99 \n\n"+
									  "If you make a mistake when you enter a price, enter a zero (0) for the next entry. \n"+
									  "The last price you entered will be subtracted from your sub-total \n\n"+
									  "When you've entered all of your prices, enter -1 to indicate that you are done.\n"+
									  "We'll then calculate whast your total owing is.", username);
		
		System.out.println(prompt);
	}
	
	/**
	 * Method for getting the sub total of all the items.
	 * @param username
	 * @return returns the sub-total in double
	 */
	public static double getSubtotal(String username) {
		double[] itemPrices = new double[10]; //initializing double array of size 10 (max item cart size)
		Scanner sc = new Scanner(System.in); //scanner
		
		//looping through the array and adding items to cart
		for (int i = 0; i <= itemPrices.length - 1; i++) {
			String prompt = String.format("Enter the price for item #%s : ", i+1);
			System.out.println(prompt);
			
			//add the price to our array, and show it to user
			double thatPrice = sc.nextDouble();
			
			//if they entered -1, break the loop
			if (thatPrice == -1) {
				break;
			}
			itemPrices[i] = thatPrice;
			String confirmation = String.format("That was $%.2f. Your sub-total is $%.2f", thatPrice, calculateSum(itemPrices));
			System.out.println(confirmation + "\n");
		}
		
		//show the individual prices to the user
		System.out.println("OK " + username + ", your individual purchase prices are: ");
		for (double price: itemPrices) {
			//if it's not equal to $0.0, then show the price
			if (price != 0) {
				System.out.println("$" + price);
			}
		}
		double sum = calculateSum(itemPrices);
		System.out.println("YOUR SUB-TOTAL IS: $" + sum);
		return sum; //return the value that was calculated using our method
	}
	
	/**
	 * Method for getting the sum of any array of doubles
	 * @param array
	 * @return the sum
	 */
	public static double calculateSum(double[] array) {
		double sum = 0.0;
		for (int i = 0; i <= array.length - 1; i++) {
			sum += array[i];
		}
		return sum;
	}

}
