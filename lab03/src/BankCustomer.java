public class BankCustomer {
	String name;
	String address;

	int validSavingAccounts;
	SavingsAccount[] savingsAccounts;

	public BankCustomer(String name, String address) {
		this.name = name;
		this.address = address;

		this.validSavingAccounts = 0;
		this.savingsAccounts = new SavingsAccount[3];
	}

	public void addAccount(SavingsAccount account) {
		if (this.validSavingAccounts < 3) {
			this.savingsAccounts[this.validSavingAccounts] = account;

			this.validSavingAccounts++;
		}
	}
	// returns the total of all account balances in euro cents
	public long balance() {
		long totalBalance = 0;
		for (int i = 0; i < this.validSavingAccounts; i++) {
			totalBalance += this.savingsAccounts[i].getBalanceInCents();
		}
		return totalBalance;
	}

	public void summary() {
		System.out.println("== account's summary for bank customer ==");
		for (int i = 0; i < this.validSavingAccounts; i++) {
			System.out.print("	balance in account " + (i+1) + "/3: €");
			System.out.print  (this.savingsAccounts[i].getBalanceInCents() / 100    +   ".");
			System.out.println(this.savingsAccounts[i].getBalanceInCents() % 100);
		}
		System.out.println("== summary complete ==");
		System.out.println();
	}
}
