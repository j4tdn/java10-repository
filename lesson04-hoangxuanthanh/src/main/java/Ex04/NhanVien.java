package Ex04;

public class NhanVien extends People{
	public double salaryN;
 
	public NhanVien(String name, int birth, double salary, double position) {
		super(name, birth, salary, position);
	}

	public NhanVien(String name, int birth, double salary, double position, int salaryN) {
		super(name, birth, salary, position);
		this.salaryN = salaryN;
	}

	public double getSalaryN() {
		return salaryN;
	}

	public void setSalaryN(int salaryN) {
		this.salaryN = salaryN;
	}

	@Override
	public String toString() {
		return "NhanVien [salaryN=" + salaryN + "]";
	}
	
	public double salaryN() {
		return salaryN = (getSalary()+getPosition()*1250000);
		
	}
	
}
