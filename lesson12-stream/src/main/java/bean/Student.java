package bean;

public class Student {
	private int id;
	private String name;
	private double avg;
	private boolean gender;
	private int grade;
	
	public Student() {
	}

	public Student(int id, String name, double avg, boolean gender, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.gender = gender;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avg=" + avg + ", gender=" + gender + ", grade=" + grade
				+ "]";
	}
}
