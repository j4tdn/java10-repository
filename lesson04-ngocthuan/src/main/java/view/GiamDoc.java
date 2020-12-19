package view;

public class GiamDoc extends People{
	 
	public double salaryG;



	public GiamDoc(String name, int birth, double salary, double position) {
		super(name, birth, salary, position);
		this.salaryG = salaryG;
	}




	public double getSalaryG() {
		return salaryG;
	}

	public void setSalaryG(double salaryG) {
		this.salaryG = salaryG;
	}

	@Override
	public String toString() {
		return "GiamDoc [salaryG=" + salaryG + "]";
	}
	
	public double salaryG() {
		return salaryG = (getSalary() + getPosition()) * 3000000;
		
	}

	public void setSalaryG(String nextLine) {
		
	}
	
	
}
