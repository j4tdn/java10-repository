package ex01;

public class Student {
	private int id;
	private String fullName;
	private float theoryPoint;
	private float performPoint;

	public Student() {
	}

	public Student(int id, String fullName, float theoryPoint, float performPoint) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.performPoint = performPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPerformPoint() {
		return performPoint;
	}

	public void setPerformPoint(float performPoint) {
		this.performPoint = performPoint;
	}

	public float mean() {
		return (performPoint + theoryPoint) / 2;

	}
	@Override
	public String toString() {
		return id + "\t\t" + fullName + "\t\t" + theoryPoint  + "\t\t" + performPoint +  "\t\t" + mean(); 
	}
}
