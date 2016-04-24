/*  Defines the base account
 *  Jean F. Dorancy
 *  04/24/2016
 */ 

public abstract class BaseAccount implements Account {
	
	protected String name;
	protected float balance;
		
	public String getName() {
		return name;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void display() {
		System.out.println("\t Account Name : \t" + name);
		System.out.println("\t Balance      : \t" + balance);
	}
	
	// Returns the balance after depositing
	public float deposit(float amount) {
		return this.balance += amount;
	}
	
	// Returns the balance withdrawing or -1 if overdrawn
	public float withdraw(float amount) {
		if(balance < amount) return -1;
		return this.balance -= amount;
	}
}
