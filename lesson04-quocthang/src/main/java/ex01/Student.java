package ex01;

public class Student {
	private long idStudent;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
		
	}

	public Student(long idStudent, String fullName, float theoreticalPoint, float practicePoint) {
		super();
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(long idStudent) {
		this.idStudent = idStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	public float getgetMediumScore() {
		return (theoreticalPoint + practicePoint)/2;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fullName=" + fullName + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicePoint=" + practicePoint + ", MediumScore=" + getgetMediumScore() + "]";
	}
	
}
