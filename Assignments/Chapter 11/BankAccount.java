public abstract class BankAccount {
	
	private double balance, annualInterest;
	private double monthlyCharge = 10;
	
	/**
	 * Constructor with three arguments
	 * @param b
	 * @param a
	 */
	public BankAccount(double b, double a) {
		this.balance = b;
		this.annualInterest = a;
	}
	
	/**
	 * Constructor for duplicating another BankAccount instance
	 * @param ba
	 */
	public BankAccount(BankAccount ba) {
		this.balance = ba.getBalance();
		this.annualInterest = ba.getAnnualInterest();
	}
	
	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
	
	abstract double monthlyProcess();
	
	
	// --- BEGIN GETTERS --- //
	public double getBalance() {
		return balance;
	}

	public double getAnnualInterest() {
		return annualInterest;
	}

	public double getMonthlyCharge() {
		return monthlyCharge;
	}
	// --- END GETTERS --- //

	
	//method for setting the monthly fee
	public void setMonthlyCharge(double monthlyCharge) {
		this.monthlyCharge = monthlyCharge;
	}
	
	
	
	
	
}
