package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class Manager extends People {
	private int numberOfEmployees;

	public Manager() {
	}

	public Manager(String fullName, LocalDate dateOfBirth, int salary, int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public int getSalary() {
		return getSalary() * 2200000;
	}
	@Override
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên quản lý: ");
		numberOfEmployees = ip.nextInt();
	}
}
