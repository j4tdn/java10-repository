package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class manager extends people{
	private int numberOfEmployees;
	
	public manager() {
		
	}

	public manager(String fullName, LocalDate dateofBirth, int salary, int numberOfEmployees) {
		super();
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
		System.out.println("Nhập số lượng nhân viên quản lý:");
		numberOfEmployees = ip.nextInt();
	}

	@Override
	public String toString() {
		return "manager [numberOfEmployees=" + numberOfEmployees + "]";
	}
}
