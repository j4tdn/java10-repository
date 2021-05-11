package bean;

public class Student {
	private String id;
	private String fullname;
	private double gpa;

	public Student() {
	}

	public Student(String id, String fullname, double gpa) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public static Student transfer(String line) {
//		S1 - Huy - 9.0
		String[] components = line.split(" - ");
		if (components.length != 3) {
			return null;
		}
		return new Student(components[0], components[1], Double.parseDouble(components[2]));
	}

	public String toLine() {
		return id + " - " + fullname + " - " + gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", gpa=" + gpa + "]";
	}
}
