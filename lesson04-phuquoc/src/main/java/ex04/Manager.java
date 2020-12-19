package ex04;

import java.time.LocalDate;

public class Manager extends People {
	private int numberOfStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String fullName, LocalDate dateOfBirth, double salaryCoefficient, int numberOfStaff) {
		super(fullName, dateOfBirth, salaryCoefficient);
		this.numberOfStaff = numberOfStaff;
	}

	public int getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}

	@Override
	public String getFullName() {
		return super.getFullName();
	}

	@Override
	public void setFullName(String fullName) {
		super.setFullName(fullName);
	}

	@Override
	public LocalDate getDateOfBirth() {
		return super.getDateOfBirth();
	}

	@Override
	public void setDateOfBirth(LocalDate dateOfBirth) {
		super.setDateOfBirth(dateOfBirth);
	}

	@Override
	public double getSalaryCoefficient() {
		return super.getSalaryCoefficient();
	}

	@Override
	public void setSalaryCoefficient(double salaryCoefficient) {
		super.setSalaryCoefficient(salaryCoefficient);
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Enter number of staff: ");
		numberOfStaff = Integer.parseInt(ip.nextLine());
	}

	@Override
	public String toString() {
		return super.toString() + " Number Of Staff: " + numberOfStaff;
	}

	@Override
	public void salary() {
		double salary = getSalaryCoefficient() * 2200000;
		System.out.println("Salary Of Manager = " + salary);
	}

}
