package ex01;


public class Main {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", 'C'),
				new Student(104, "Hoàng", 'D'),
				new Student(109, "Lan", 'A'),
				new Student(103,"Bảo", 'F'),
				new Student(105,"Nguyên", 'B'),
				new Student(107,"Vũ", 'F'),
				new Student(103,"Bảo", 'F'),
				new Student(202,"Đạt", 'C'),
				new Student(107,"Vũ", 'C'),
				new Student(193,"Bảo", 'B'),
				new Student(199,"Tài", 'A')
		};
		
		AGradeStudent(students);
		System.out.println("===========");
		// 103-Bảo, 107-Vũ
		FGradeStudent(students);
	}
	
	
	
	private static void AGradeStudent(Student[] arr) {
		Student[] AGradeArray = arr;
		for(Student students : AGradeArray) {
			if(students.getGrade() == 'A') {
				System.out.println(students);
			}
		}
	}
	private static void FGradeStudent(Student[] arr) {
		Student[] FGradeStudent = arr;
		for(int i = 0; i < FGradeStudent.length; i++) {
			for(int j = 0; j < FGradeStudent.length; j++) {
				if(FGradeStudent[i].getId() == FGradeStudent[j].getId() && i != j) {
					System.out.println(FGradeStudent[i]);
				}
			}
		}

	}
}
