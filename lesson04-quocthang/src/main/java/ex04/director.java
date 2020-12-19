package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class director extends people {
	private int positionCoefficient;
	
	public director() {
		
	}

	public director(String fullName, LocalDate dateofBirth, int salary, int positionCoefficient) {
		super();
		this.positionCoefficient = positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public int getSalary() {
		return (getSalary() + getPositionCoefficient()) * 3000000;
	}
	
	@Override
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập hệ số chức vụ: ");
		positionCoefficient = ip.nextInt();
	}

	@Override
	public String toString() {
		return "director [positionCoefficient=" + positionCoefficient + "]";
	}
	
	
	
	
	
}
