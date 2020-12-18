package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class People {
	private String fullName;
	private LocalDate birthDate;
	private double salaryCoefficient;

	public People() {
	}

	public People(String fullName, LocalDate birthDay, double salaryCoefficient) {
		super();
		this.fullName = fullName;
		this.birthDate = birthDay;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDay) {
		this.birthDate = birthDay;
	}

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public static Scanner ip = new Scanner(System.in);

	public void input() {
		System.out.print("Enter fullName: ");
		fullName = ip.nextLine();
		System.out.print("Enter birthDate: (yy,MM,dd)");
		birthDate = LocalDate.of(Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine()),
				Integer.parseInt(ip.nextLine()));
		System.out.print("Enter salary Coefficient : ");
		salaryCoefficient = Double.parseDouble(ip.nextLine());
	}
	public void salary() {
		
	}
	@Override
	public String toString() {
		return fullName + "\t\t" + birthDate + "\t\t" + "salaryCoefficient = " + salaryCoefficient + "  ";
	}
}
