package ex01;

public class Student {
	
	private String name;
	private int age;
	private enum rankedAcademic
	{
		A, B, C, D, E, F
	};

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}


	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Tuan", 24 );
		students[1] = new Student("Cuong", 25);
		students[2] = new Student("Duc", 24);
		for (int i = 0; i < 3; i++) {
			students[i].display();
		}
	
	
	}	
}
