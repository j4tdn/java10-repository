package ex04;

import java.time.LocalDate;

public class Staff extends People {
	private String nameDepartment;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String fullName, LocalDate dateOfBirth, double salaryCoefficient, String nameDepartment) {
		super(fullName, dateOfBirth, salaryCoefficient);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
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
		System.out.print("Name Department: ");
		nameDepartment = ip.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "Name Department: "+nameDepartment;
		
	}

	@Override
	public void salary() {
		double salary = getSalaryCoefficient() * 1250000;
		System.out.println("Salary Of Staff = " + salary);
	}

}
