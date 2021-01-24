package ex01;

import java.util.Arrays;

public class StudentManagement {
	public static void main(String[] args) {
		Student[] students = new Student[11];
		students[0] = new Student(102, "Nam", Classification.C);
		students[1] = new Student(104, "Hoàng", Classification.D);
		students[2] = new Student(109, "Lan", Classification.A);
		students[3] = new Student(103, "Bảo", Classification.F);
		students[4] = new Student(105, "Nguyên", Classification.B);
		students[5] = new Student(107, "Vũ", Classification.F);
		students[6] = new Student(106, "Bảo", Classification.F);
		students[7] = new Student(202, "Đạt", Classification.C);
		students[8] = new Student(117, "Vũ", Classification.C);
		students[9] = new Student(193, "Bảo", Classification.B);
		students[10] = new Student(199, "Tài", Classification.A);
		
		Student[] studentA = getClassification(students, s-> s.getClassification() == Classification.A);
		Student[] studentF = getClassification(students, s -> s.getClassification() == Classification.F);
		
		System.out.println(Arrays.toString(studentA));
		System.out.println(Arrays.toString(studentF));
	}

	private static Student[] getClassification(Student[] students, Condition con) {
		Student[] arrStudent = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (con.check(student)) {
				arrStudent[index++] = student;
			}
		}
		return Arrays.copyOfRange(arrStudent, 0, index);
	}
}
