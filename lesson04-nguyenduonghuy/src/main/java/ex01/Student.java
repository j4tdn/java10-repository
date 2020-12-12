package ex01;

public class Student {
	private long id;
	private String fullName;
	private float theoretical;
	private float practical;
	
	public Student() {
		id = 0;
		fullName = "";
		theoretical = 0;
		practical = 0;
	}
	
	public Student(long id, String fullName, float theoretical, float practical) {
		this.id = id;
		this.fullName = fullName;
		this.theoretical = theoretical;
		this.practical = practical;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoretical() {
		return theoretical;
	}

	public void setTheoretical(float theoretical) {
		this.theoretical = theoretical;
	}

	public float getPractical() {
		return practical;
	}

	public void setPractical(float practical) {
		this.practical = practical;
	}
	
	public float getGPA() {
		return (theoretical + practical) / 2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoretical=" + theoretical + ", practical="
				+ practical + ", GPA=" + getGPA() + "]";
	}
}
