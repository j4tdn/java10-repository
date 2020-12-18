package ex04;

import java.time.LocalDate;

public class Director extends People {
	private double posiCoefficient;

	public Director() {
	}

	public Director(String fullName, LocalDate birthDay, double salaryCoefficient,double posiCoefficient) {
		super(fullName, birthDay, salaryCoefficient);
		this.posiCoefficient = posiCoefficient;
	}

	public double getPosiCoefficient() {
		return posiCoefficient;
	}

	public void setPosiCoefficient(double posiCoefficient) {
		this.posiCoefficient = posiCoefficient;
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
	public LocalDate getBirthDate() {
		return super.getBirthDate();
	}

	@Override
	public void setBirthDate(LocalDate birthDay) {
		super.setBirthDate(birthDay);
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
		System.out.print("Enter position Coefficient: ");
		posiCoefficient =Double.parseDouble(ip.nextLine());
	}
	@Override
	public void salary() {
		double salary =( getSalaryCoefficient()+ getPosiCoefficient()) *3000000;
		System.out.println("salary director = " + salary);
	}

	public String toString() {
		return super.toString()+ "position Coefficient = " + posiCoefficient;
	}
}
