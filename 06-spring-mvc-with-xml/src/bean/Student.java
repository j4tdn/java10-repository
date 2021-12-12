package bean;

public class Student {
	private String fullname;
	private String age;
	
	public Student() {
	}

	public Student(String fullname, String age) {
		this.fullname = fullname;
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
