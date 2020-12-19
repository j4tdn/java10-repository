package ex04;

public class Employee extends People {
	private String position;

	public Employee() {
		
	}

	public Employee(String fullName, String birth, double salary, String position) {
		super(fullName, birth, salary);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double money() {
		return salary * 1250000;

	}

	@Override
	public String toString() {
		return "Employee [position=" + position + ", fullName=" + fullName + ", birth=" + birth + ", salary=" + salary
				+ ", getPosition()=" + getPosition() + ", money()=" + money() + "]";
	}

	

}
