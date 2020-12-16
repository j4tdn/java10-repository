package ex04;

import java.time.LocalDate;

public class President extends People {
	private int salary;

	public President() {
	}

	public President(String fullName, LocalDate dateofBirth, int salaryFactor, int positionFactor) {
		super(fullName, dateofBirth, salaryFactor, positionFactor);

	}

	public President(String string, String string2, int i, int j) {

	}

	@Override
	public int salary() {
		return salary = ((getSalaryFactor() + getPositionFactor()) * 3000000);

	}

	@Override
	public String toString() {
		return super.getFullName() + " (Director) - " + getDateofBirth() + " - " + getSalaryFactor() + " - "
				+ getPositionFactor() + ": Salary = " + salary();
	}

}
