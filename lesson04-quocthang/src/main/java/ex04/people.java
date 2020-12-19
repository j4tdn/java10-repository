package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class people {
	private String fullName;
	private LocalDate dateofBirth;
	private int salary;
	
	public people() {
		
	}

	public people(String fullName, LocalDate dateofBirth, int salary) {
		super();
		this.fullName = fullName;
		this.dateofBirth = dateofBirth;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void input() {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập họ tên:");
		fullName = ip.nextLine();
		System.out.print("Nhập ngày tháng năm sinh:");
		dateofBirth = LocalDate.of(ip.nextInt(), ip.nextInt(), ip.nextInt());
		System.out.print("Nhập hệ số lương:");
		salary = ip.nextInt();
	}

	@Override
	public String toString() {
		return "people [fullName=" + fullName + ", dateofBirth=" + dateofBirth + ", salary=" + salary + "]";
	}
}
