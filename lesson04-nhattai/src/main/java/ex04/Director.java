package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class Director extends People {
	private int position;

	public Director() {
	}

	public Director(String fullName, LocalDate dateOfBirth, int salary, int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public int getSalary() {
		return (getSalary() + getPosition()) * 3000000;
	}
	@Override
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập hệ số chức vụ");
		position = ip.nextInt();
	}

	@Override
	public String toString() {
		return "Director [position=" + position + "]";
	}
	
	
}
