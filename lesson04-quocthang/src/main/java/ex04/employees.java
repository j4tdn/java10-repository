package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class employees extends people {
	private String untiName;
	
	public employees() {
		
	}

	public employees(String fullName, LocalDate dateofBirth, int salary, String untiName) {
		super();
		this.untiName = untiName;
	}

	public String getUntiName() {
		return untiName;
	}

	public void setUntiName(String untiName) {
		this.untiName = untiName;
	}
	
	@Override
	public int getSalary() {
		return getSalary() * 1250000;
	}
	
	@Override
	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên đơn vị");
		untiName=ip.nextLine();
	}

	@Override
	public String toString() {
		return "employees [untiName=" + untiName + "]";
	}
	
	
	
	
}
