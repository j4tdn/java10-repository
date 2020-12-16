package ex04;

import java.time.LocalDate;

public class Manager extends People {
	private int amountOfEmp; // số lượng nhân viên quản lí

	public Manager() {
	}

	public Manager(String fullName, LocalDate birthDay, double salaryCoefficient, int amountOfEmp) {
		super(fullName, birthDay, salaryCoefficient);
		this.amountOfEmp = amountOfEmp;
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

	public int getAmountOfEmp() {
		return amountOfEmp;
	}

	public void setAmountOfEmp(int amountOfEmp) {
		this.amountOfEmp = amountOfEmp;
	}

	public void input() {
		super.input();
		amountOfEmp = Integer.parseInt(ip.nextLine());
	}

	@Override
	public void salary() {
		double salary =( getSalaryCoefficient()+ 0)*2200000;
		System.out.println("salary manager = " + salary);
	}

	public String toString() {
		return super.toString() + "amount of Employees = " + amountOfEmp;
	}

}
