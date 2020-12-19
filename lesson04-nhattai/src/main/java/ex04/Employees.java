package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class Employees extends People {
	private int Department;

	public Employees() {
	}

	public Employees(String fullName, LocalDate dateOfBirth, int salary, int department) {
		Department = department;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}

	@Override
	public int getSalary() {
		return getSalary() * 1250000;
	}
	@Override
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên phòng ban: ");
		Department = ip.nextInt();
	}

	@Override
	public String toString() {
		return "Employees [Department=" + Department + "]";
	}
	

}
