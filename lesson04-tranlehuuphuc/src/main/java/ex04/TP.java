package ex04;

public class TP extends People {
	public double salaryTP;

	public TP(String name, int birthDay, double salary, double position) {
		super(name, birthDay, salary, position);
	}

	public TP(String name, int birthDay, double salary, double position, double salaryTP) {
		super(name, birthDay, salary, position);
		this.salaryTP = salaryTP;
	}

	public double getSalaryTP() {
		return salaryTP;
	}

	public void setSalaryT(double salaryTP) {
		this.salaryTP = salaryTP;
	}

	@Override
	public String toString() {
		return "TP [salaryTP=" + salaryTP + "]";
	}
	
	public double salaryTP() {
		return salaryTP = (getSalary()+ getPosition()*2200000);
		
	}
}


