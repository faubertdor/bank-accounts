
public class CheckingAccount extends SavingsAccount {
	
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
}
