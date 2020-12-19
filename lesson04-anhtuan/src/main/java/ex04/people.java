package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class people {
	private String fullName;
	private LocalDate dayOfBirth;
	private int salary;

	public people() {

	}

	public people(String fullName, LocalDate dayOfBirth, int salary) {
		this.fullName = fullName;
		this.dayOfBirth = dayOfBirth;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
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
		dayOfBirth = LocalDate.of(ip.nextInt(), ip.nextInt(), ip.nextInt());
		System.out.print("Nhập hệ số lương:");
		salary = ip.nextInt();
	}

	@Override
	public String toString() {
		return "people [fullName=" + fullName + ", dayOfBirth=" + dayOfBirth + ", salary=" + salary + "]";
	}

}
