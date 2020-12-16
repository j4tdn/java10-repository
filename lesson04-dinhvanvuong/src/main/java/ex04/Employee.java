package ex04;

import java.time.LocalDate;

public class Employee extends People {
	private String unitName;
	private int salary;

	
	public Employee(String fullName, LocalDate dateofBirth, int salaryFactor, int positionFactor) {
		super(fullName, dateofBirth, salaryFactor, positionFactor);

	}

	public Employee(String unitName) {

		this.unitName = unitName;
	}

	public Employee(String string, String string2, int i, int j, String string3) {
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public int salary() {
		return salary = ((getSalaryFactor()+getPositionFactor())*1250000);
	}
	@Override
	public String toString() {
		return super.getFullName() + " - " + getDateofBirth() + " - " + getSalaryFactor() + " - Employee (" + unitName + "): Salary = "
				+ salary();
	}

}
