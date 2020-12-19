package ex04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class People {
	private String fullName;
	private LocalDate dateOfBirth;
	private double salaryCoefficient;

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String fullName, LocalDate dateOfBirth, double salaryCoefficient) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
		System.out.print("Enter Year - Enter Month - Enter Day: (yyyy,MM,dd)");
		dateOfBirth = LocalDate.of(Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine()),
				Integer.parseInt(ip.nextLine()));
		
		
	        System.out.print("Enter salary Coefficient : ");
			salaryCoefficient = Double.parseDouble(ip.nextLine());
	}

	@Override
	public String toString() {
		return "FullName: " + fullName + ", DateOfBirth: " + dateOfBirth + ", Salary Coefficient: "
				+ salaryCoefficient + ", ";
	}

	public void salary() {
		
	}

}
