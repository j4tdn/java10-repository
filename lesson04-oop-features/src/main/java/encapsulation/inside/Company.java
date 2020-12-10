package encapsulation.inside;

public class Company {
	String compID;
	protected int numberOfEmps;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
