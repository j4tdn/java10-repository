package ex01;

public class Students {
	private long idStudent;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoint;

	public Students() {

	}

	public Students(long idStudent, String fullName, float theoreticalPoint, float practicePoint) {
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

	public float getMediumScore() {
		return (theoreticalPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Students [idStudent=" + idStudent + ", fullName=" + fullName + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicePoint=" + practicePoint + ", Mediumscore=" + getMediumScore() + "]";
	}

}
