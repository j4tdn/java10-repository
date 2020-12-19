package ex04;

public class NV extends People {

	public double salaryNV;

	public NV(String name, int birthDay, double salary, double position) {
		super(name, birthDay, salary, position);
	}

	public NV(String name, int birthDay, double salary, double position, int salaryNV) {
		super(name, birthDay, salary, position);
		this.salaryNV = salaryNV;
	}

	public double getSalaryNV() {
		return salaryNV;
	}

	public void setSalaryNV(int salaryNV) {
		this.salaryNV = salaryNV;
	}

	@Override
	public String toString() {
		return "NV [salaryNV=" + salaryNV + "]";
	}

	public double salaryNV() {
		return salaryNV = (getSalary() + getPosition() * 1250000);

	}

}
