package encapsulation.inside;

public class Company {
	String compId;
	private double balance;
	protected int numberOfEmps;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
