package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class People {
	private String fullName;
	private LocalDate dateOfBirth;
	private int salary;
	public People() {
	}
	public People(String fullName, LocalDate dateOfBirth, int salary) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		fullName = ip.nextLine();
		System.out.println("Nhập ngày tháng năm sinh: ");
		dateOfBirth = LocalDate.of(ip.nextInt(), ip.nextInt(), ip.nextInt());
		System.out.println("Nhập hệ số lương: ");
		salary = ip.nextInt();
	}
	@Override
	public String toString() {
		return "People [fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}
	
}
