
void main() {
	SavingsAccount saver1 = new SavingsAccount(2000,0);
	SavingsAccount saver2 = new SavingsAccount(3000,0);

	saver1.printBalance("saver 1");
	saver2.printBalance("saver 2");
	// 4% balance
	SavingsAccount.modifyInterestRate(0.04f);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();

	System.out.println("=== calculated interest for the month ===");

	saver1.printBalance("saver 1");
	saver2.printBalance("saver 2");
	// 5% balance
	SavingsAccount.modifyInterestRate(0.05f);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();

	System.out.println("=== calculated interest for the month ===");

	saver1.printBalance("saver 1");
	saver2.printBalance("saver 2");

}
