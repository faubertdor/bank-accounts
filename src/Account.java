/*  Defines the base for all accounts
 *  Jean F. Dorancy
 *  04/24/2016
 */ 

public interface Account {
	
	// Returns the balance after depositing
	public float deposit(float amount);
	
	// Returns the balance withdrawing
	public float withdraw(float amount);
}
