/*  Defines a Savings Acct.
 *  Jean F. Dorancy
 *  04/24/2016
 */ 

public class SavingsAccount extends BaseAccount {
	
	private static float savingsRate;
	
	public static void setInterestRate(float rate) {
		savingsRate = rate;
	}
	
	public SavingsAccount(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	public SavingsAccount(String name, float balance) {
		this(name);
		this.balance = balance;
	}
	
	public void displaySavings() {
		super.display();
		System.out.println("\t Interest Rate: \t" + savingsRate);
		System.out.println("\t**************************\n\n");
	}
}
