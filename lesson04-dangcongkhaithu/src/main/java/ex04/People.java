package ex04;


public class People {
	protected String fullName;
	protected String birth;
	protected double salary;

	public People() {
	}

	public People(String fullName, String birth, double salary) {
		this.fullName = fullName;
		this.birth = birth;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
