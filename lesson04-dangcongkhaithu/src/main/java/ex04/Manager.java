package ex04;

public class Manager extends People {
	private double factorPosition;

	public Manager() {
	}

	public Manager(String fullName, String birth, double salary, double factorPosition) {
		super(fullName, birth, salary);
		this.factorPosition = factorPosition;

	}

	public double getFactorPosition() {
		return factorPosition;
	}

	public void setFactorPosition(double factorPosition) {
		this.factorPosition = factorPosition;
	}

	public double money() {
		return (salary + factorPosition) * 30000000;

	}

	@Override
	public String toString() {
		return "Manager [factorPosition=" + factorPosition + ", fullName=" + fullName + ", birth=" + birth + ", salary="
				+ salary + ", getFactorPosition()=" + getFactorPosition() + ", money()=" + money() + "]";
	}

}
