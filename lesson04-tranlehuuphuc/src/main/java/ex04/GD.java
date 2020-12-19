package ex04;

public class GD extends People {
	public double salaryGD;

	public GD(String name, int birthDay, double salary, double position) {
		super(name, birthDay, salary, position);
		this.salaryGD = salaryGD;
	}

	public double getSalaryGD() {
		return salaryGD;
	}

	public void setSalaryGD(double salaryGD) {
		this.salaryGD = salaryGD;
	}

	@Override
	public String toString() {
		return "GD [salaryGD=" + salaryGD + "]";
	}

	public double salaryG() {
		return salaryGD = ((getSalary() + getPosition()) * 3000000);

	}

	public void setSalaryGD(String nextLine) {

	}

}
