package encapsulation.inside;

public class Company {
	String compId; //default
	private double balance;
	protected int numberOfEmps;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
