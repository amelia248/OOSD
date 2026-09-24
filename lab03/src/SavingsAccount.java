public class SavingsAccount {
	private static int uniqueIDTracker = 1;
	private static float annualInterestRate = 0.04f;

	private int  uniqueID;
	private long savingsBalance; // balance in euro cents, no floating point error

	public SavingsAccount(long startingBalanceEuro, long startingBalanceCents) {
		this.uniqueID = uniqueIDTracker;
		uniqueIDTracker++;

		this.savingsBalance = startingBalanceEuro * 100 + startingBalanceCents;
	}

	public long getBalanceInCents() { return this.savingsBalance; }

	public static void modifyInterestRate(float newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	// s * (1.04)
	// s * 1 + s * .04
	public void calculateMonthlyInterest() {
		long interest = (long)(this.savingsBalance * annualInterestRate) / 12;

		this.savingsBalance += interest;
	}

	public void printBalance(String name) {
		System.out.print  ("current balance of " + name + ": €");
		System.out.print  (this.savingsBalance / 100    +   ".");

		System.out.println(this.savingsBalance % 100);
	}
}
