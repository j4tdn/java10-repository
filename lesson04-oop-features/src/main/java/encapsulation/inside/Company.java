package encapsulation.inside;

public class Company {
	// thuộc tính: 
	// access modifier: private public protected default
	String compId;
	protected int numberOfEmps;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
