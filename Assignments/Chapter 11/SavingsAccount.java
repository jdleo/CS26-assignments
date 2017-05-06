

public class SavingsAccount extends BankAccount {

	private int nDeposits, nWithdraws;
	private boolean active;
	
	
	
	/**
	 * Constructor with six fields
	 * @param b
	 * @param a
	 * @param m
	 * @param nDeposits
	 * @param nWithdraws
	 * @param active
	 */
	public SavingsAccount(double b, double a, int nDeposits, int nWithdraws, boolean active) {
		super(b, a);
		this.nDeposits = nDeposits;
		this.nWithdraws = nWithdraws;
		this.active = active;
	}

	/**
	 * Duplicater Constructor
	 * @param ba
	 * @param sa
	 */
	public SavingsAccount(BankAccount ba, SavingsAccount sa) {
		super(ba);
		this.nDeposits = sa.getNDeposits();
		this.nWithdraws = sa.getNWithdraws();
		this.active = sa.isActive();
	}
	
	@Override
	public void deposit() {
		//do deposit
		
		if (super.getBalance() < 25.00) {
			this.active = false;
		} else {
			this.active = true;
		}
	}
	
	@Override
	public void withdraw() {
		
		
		if ( !this.isActive() ) {
			System.out.println("Withdraw not allowed, account is inactive.");
		} else {
			//do withdraw
			
			if (super.getBalance() < 25.00) {
				this.active = false;
			}
		}
		
		
	}
	
	@Override 
	double monthlyProcess() {
		int totalTransactions = this.nDeposits + this.nWithdraws;
		
		//every 4 deposits or withdraws, add 1$ to monthly service fee
		double newMonthlyCharge = (super.getMonthlyCharge() + Math.floor(totalTransactions / 4));
		super.setMonthlyCharge(newMonthlyCharge);
		return newMonthlyCharge;
	}

	// --- BEGIN GETTERS --- //
	public int getNDeposits() {
		return nDeposits;
	}

	public int getNWithdraws() {
		return nWithdraws;
	}

	public boolean isActive() {
		return active;
	}
	// --- END GETTERS --- //
	
	
	
}
