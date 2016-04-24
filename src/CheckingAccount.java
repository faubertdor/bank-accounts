
public class CheckingAccount extends SavingsAccount {
	
	private static float checkingRate;
	
	public static void setInterestRate(float rate) {
		checkingRate = rate;
	}
	public CheckingAccount(String name) {
		super(name);
	}
	
	public CheckingAccount(String name, float balance) {
		super(name, balance);
	}
	
	// Cash a check plus pay a fee
	public float cashCheck(float amount, float fee) {
		return super.withdraw(amount + fee);
	}
	
	public void displayChecking() {
		super.display();
		System.out.println("\t Interest Rate: \t" + checkingRate);
		System.out.println("\t**************************\n\n");
	}
}
