package ex01;

public class Alumnus {
	private int idAlumnus;
	private String fullName;
	private float  pointTheoretical;
	private float pointPractice;
	
	public Alumnus() {
		// TODO Auto-generated constructor stub
	}

	public Alumnus(int idAlumnus, String fullName, float pointTheoretical, float pointPractice) {
		super();
		this.idAlumnus = idAlumnus;
		this.fullName = fullName;
		this.pointTheoretical = pointTheoretical;
		this.pointPractice = pointPractice;
	}

	public int getIdAlumnus() {
		return idAlumnus;
	}

	public void setIdAlumnus(int idAlumnus) {
		this.idAlumnus = idAlumnus;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getPointTheoretical() {
		return pointTheoretical;
	}

	public void setPointTheoretical(float pointTheoretical) {
		this.pointTheoretical = pointTheoretical;
	}

	public float getPointPractice() {
		return pointPractice;
	}

	public void setPointPractice(float pointPractice) {
		this.pointPractice = pointPractice;
	}
	
	public float pointAverage() {
		return (pointPractice + pointTheoretical) / 2;
	}

	@Override
	public String toString() {
		return "Alumnus [idAlumnus: " + idAlumnus + ", fullName: " + fullName + ", pointTheoretical: " + pointTheoretical
				+ ", pointPractice: " + pointPractice + ", pointAverage: " + pointAverage() + "]";
	}
	
	
	
}
