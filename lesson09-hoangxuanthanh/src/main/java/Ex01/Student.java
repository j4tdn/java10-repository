package Ex01;

public class Student {
	public String name;
	public int ID;
	public String classification;
	
	public Student(String name, int iD, String classification) {
		this.name = name;
		ID = iD;
		this.classification = classification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", classification=" + classification + "]";
	}
	
	
}
