package ex04;

import java.time.LocalDate;

public class Personnel extends People {
	private String departmentName;

	public Personnel() {
	}

	public Personnel(String fullName, LocalDate birthDay, double salaryCoefficient, String departmentName) {
		super(fullName, birthDay, salaryCoefficient);
		this.departmentName = departmentName;

	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String getFullName() {
		return super.getFullName();
	}

	public void setFullName(String fullName) {
		super.setFullName(fullName);
	}

	public LocalDate getBirthDate() {
		return super.getBirthDate();
	}

	@Override
	public void setBirthDate(LocalDate birthDay) {
		super.setBirthDate(birthDay);
	}

	public double getSalaryCoefficient() {
		return super.getSalaryCoefficient();
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		super.setSalaryCoefficient(salaryCoefficient);
	}

	public void input() {
		super.input();
		System.out.print(" Department Name : ");
		departmentName = ip.nextLine();
	}

	@Override
	public void salary() {
		double salary =( getSalaryCoefficient()+ 0)*1250000;
		System.out.println("salary personnel = " + salary);
	}
	public String toString() {
		return super.toString() + " Department Name : " + departmentName;
	}

}
