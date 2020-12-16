package ex04;

import java.time.LocalDate;

public class Manager extends People {
	private float numberOfEmployee;
	private int salary;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate dateofBirth, int salaryFactor, int positionFactor) {
		super(fullName, dateofBirth, salaryFactor, positionFactor);
		
	}

	public Manager(float numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	
	public Manager(String string, String string2, int i, int j, String string3) {
	}

	public float getNumberOfEmployee() {
		return numberOfEmployee;
	}

	
	public void setNumberOfEmployee(float numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	@Override
	public int salary() {
		return salary = ((getSalaryFactor()+getPositionFactor())*2200000);
	}

	@Override
	public String toString() {
		return super.getFullName() + " (Manager) - " + super.getDateofBirth() + " - " + numberOfEmployee + "(employees): Salary = " + salary();
	}
	
	}
		
	
	
	
	
	
	
	


