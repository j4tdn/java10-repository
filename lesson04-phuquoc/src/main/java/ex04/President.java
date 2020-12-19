package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class President extends People {
	private int positionCoefficient;

	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String fullName, LocalDate dateOfBirth, double salaryCoefficient, int positionCoefficient) {
		super(fullName, dateOfBirth, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
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
		System.out.print("Enter position Coefficient: ");
		positionCoefficient = Integer.parseInt(ip.nextLine());
	}

	@Override
	public void salary() {
		double salary =( getSalaryCoefficient()+ getPositionCoefficient()) * 3000000;
		System.out.println("Salary Of President = " + salary);
	}

	@Override
	public String toString() {
		return super.toString() + "Position Coefficient: " +positionCoefficient;
	}

}
