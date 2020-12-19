package ex01;

public class Students {
	private long idStudent;
	private String fullName;
	private float thPoint;
	private float prPoint;

	public Students() {
	}

	public Students(long idStudent, String fullName, float thPoint, float prPoint) {
		super();
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.thPoint = thPoint;
		this.prPoint = prPoint;
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

	public float getThPoint() {
		return thPoint;
	}

	public void setThPoint(float thPoint) {
		this.thPoint = thPoint;
	}

	public float getPrPoint() {
		return prPoint;
	}

	public void setPrPoint(float prPoint) {
		this.prPoint = prPoint;
	}

	public float getGPA() {
		return (thPoint + prPoint) / 2;
	}

	@Override
	public String toString() {
		return "Students [idStudent=" + idStudent + ", fullName=" + fullName + ", thPoint=" + thPoint + ", prPoint="
				+ prPoint + ", GRADE POINT AVERAGE = " + getGPA() + "]";
	}

}
