/*
 *  Bank class that uses the accounts
 *  Jean F. Dorancy
 *  04/24/2016
*/
public class Bank {
	
	public static void main(String[] args) {
		SavingsAccount.setInterestRate(0.05f);
		CheckingAccount.setInterestRate(0.01f);
		SavingsAccount delta = new SavingsAccount("Delta");
		CheckingAccount beta = new CheckingAccount("Beta", 10);
		float balance;
		
		delta.displaySavings();
		delta.deposit(1000);
		delta.displaySavings();
		
		balance = delta.withdraw(2000);
		if(balance == -1) 
			System.out.println("Account overdrawn!\n\n");
		else
			delta.display();
		
		balance = beta.cashCheck(50, 1);
		System.out.println("Method returns -1 if account overdrawn: " + balance);
		System.out.println("The actual balance is below.\n\n");
		beta.displayChecking();
		
	}

}
