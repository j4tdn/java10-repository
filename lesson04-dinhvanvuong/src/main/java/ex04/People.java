package ex04;

import java.time.LocalDate;

public abstract class People {
	private String fullName;
	private LocalDate dateofBirth;
	private int salaryFactor;
	private int positionFactor;

	public People() {

	}

	public People(String fullName, LocalDate dateofBirth, int salaryFactor, int positionFactor) {
		this.fullName = fullName;
		this.dateofBirth = dateofBirth;
		this.salaryFactor = salaryFactor;
		this.positionFactor = positionFactor;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public int getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(int salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

	public int getPositionFactor() {
		return positionFactor;
	}

	public void setPositionFactor(int positionFactor) {
		this.positionFactor = positionFactor;
	}

	@Override
	public String toString() {
		return "People [fullName=" + fullName + ", dateofBirth=" + dateofBirth + ", salaryFactor=" + salaryFactor
				+ ", positionFactor=" + positionFactor + "]";
	}

	public int salary() {
		return 0;
	}

	
	}


