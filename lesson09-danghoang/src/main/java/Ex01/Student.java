package Ex01;

public class Student {
	private int id;
	private String name;
	private Graded graded;

	public static void main(String[] args) {
		Student[] list = new Student[11];
		list[0] = new Student(102, "Nam", Graded.C);
		list[1] = new Student(104, "Hoang", Graded.D);
		list[2] = new Student(109, "Lan", Graded.A);
		list[3] = new Student(103, "Bao", Graded.F);
		list[4] = new Student(105, "Nguyen", Graded.B);
		list[5] = new Student(107, "Vu", Graded.F);
		list[6] = new Student(103, "Bao", Graded.F);
		list[7] = new Student(202, "Dat", Graded.C);
		list[8] = new Student(107, "Vu", Graded.C);
		list[9] = new Student(193, "Bao", Graded.B);
		list[10] = new Student(199, "Tai", Graded.A);
		Astudents(list);
		Fstudents(list);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Graded graded) {
		super();
		this.id = id;
		this.name = name;
		this.graded = graded;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Graded getGraded() {
		return graded;
	}

	public void setGraded(Graded graded) {
		this.graded = graded;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", graded=" + graded + "]";
	}

	public static void Astudents(Student[] List) {
		System.out.println("Hoc sinh diem A:");
		for (Student student : List) {
			if (student.getGraded() == Graded.A) {
				System.out.println(student);
			}
		}
	}

	public static void Fstudents(Student[] List) {
		System.out.println("Hoc sinh hoc lai: ");
		for (Student student : List) {
			if (student.getGraded() == Graded.F) {
				System.out.println(student);
			}
			
		}
	}

}
