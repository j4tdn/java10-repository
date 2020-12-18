package ex04;

import java.time.LocalDate;

public class Manager extends People {
	private int numberOfManagerEmployees; // số lượng nhân viên quản lí

	public Manager() {
	}

	public Manager(String fullName, LocalDate birthDay, double salaryCoefficient, int numberOfManagerEmployees) {
		super(fullName, birthDay, salaryCoefficient);
		this.numberOfManagerEmployees = numberOfManagerEmployees;
	}

	public String getFullName() {
		return super.getFullName();
	}

	public void setFullName(String fullName) {
		super.setFullName(fullName);
	}

	public LocalDate getBirthDate() {
		return super.getBirthDate();
	}

	public void setBirthDate(LocalDate birthDay) {
		super.setBirthDate(birthDay);
	}

	public double getSalaryCoefficient() {
		return super.getSalaryCoefficient();
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		super.setSalaryCoefficient(salaryCoefficient);
	}

	public int getnumberOfManagerEmployees() {
		return numberOfManagerEmployees;
	}

	public void setnumberOfManagerEmployees(int numberOfManagerEmployees) {
		this.numberOfManagerEmployees = numberOfManagerEmployees;
	}

	public void input() {
		super.input();
		System.out.println("Enter number Of Manager Employees :");
		numberOfManagerEmployees = Integer.parseInt(ip.nextLine());
	}

	@Override
	public void salary() {
		double salary =( getSalaryCoefficient()+ 0)*2200000;
		System.out.println("salary manager = " + salary);
	}

	public String toString() {
		return super.toString() + "number Of Manager Employees = " + numberOfManagerEmployees;
	}
}
