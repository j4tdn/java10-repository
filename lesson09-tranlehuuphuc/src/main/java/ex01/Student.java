package ex01;

public class Student {
	public String name;
	public int ID;
	public String classified;

	public Student(String name, int ID, String classified) {
		this.name = name;
		ID = ID;
		this.classified = classified;
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

	public String getClassified() {
		return classified;
	}

	public void setClassified(String classified) {
		this.classified = classified;
	}

	@Override
	public String toString() {

		return "Ranked [ID=" + ID + ",name=" + name + ",classified=" + classified + "]";
	}

}
