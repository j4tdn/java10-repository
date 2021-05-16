package ex04;

public class Student {
	private String id;
	private String name;
	private double meanScore;
	private String gender;
	
	public Student() {
	}

	public Student(String id, String name, double meanScore, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.meanScore = meanScore;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMeanScore() {
		return meanScore;
	}

	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", meanScore=" + meanScore + ", gender=" + gender + "]";
	}
	
}
