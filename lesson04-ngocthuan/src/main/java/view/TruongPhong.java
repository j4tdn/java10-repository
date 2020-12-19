package view;

public class TruongPhong extends People{
	public double salaryT;

	public TruongPhong(String name, int birth, double salary, double position) {
		super(name, birth, salary, position);
	}

	public TruongPhong(String name, int birth, double salary, double position, double salaryT) {
		super(name, birth, salary, position);
		this.salaryT = salaryT;
	}

	public double getSalaryT() {
		return salaryT;
	}

	public void setSalaryT(double salaryT) {
		this.salaryT = salaryT;
	}

	@Override
	public String toString() {
		return "TruongPhong [salaryT=" + salaryT + "]";
	}
	
	public double salaryT() {
		return salaryT = (getSalary()+ getPosition()*220000);
		
	}
}