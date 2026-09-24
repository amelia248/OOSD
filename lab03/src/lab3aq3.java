
void main() {
	SavingsAccount acc1 = new SavingsAccount(2000,0);
	SavingsAccount acc2 = new SavingsAccount(800,50);

	BankCustomer customerA = new BankCustomer("John Doe", "18 Hilltop Drive, Ballyvalley, Clare");

	customerA.addAccount(acc1);
	customerA.addAccount(acc2);

	System.out.println(
		"total balance across all accounts for customer A: €" +
		customerA.balance()/100 + "." +
		customerA.balance()%100
	);
	customerA.summary();

	SavingsAccount.modifyInterestRate(0.05f);
	System.out.println("== calculated interest for the month ==\n");
	acc1.calculateMonthlyInterest();
	acc2.calculateMonthlyInterest();

	System.out.println(
		"total balance across all accounts for customer A: €" +
		customerA.balance()/100 + "." +
		customerA.balance()%100
	);
	customerA.summary();


}
