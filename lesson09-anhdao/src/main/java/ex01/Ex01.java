package ex01;

public class Ex01 {
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
	}
	private static void aStudent(Student[] arr) {
		Student[] AGrade = arr;
		for(Student students : AGrade) {
			if(students.getGrade() == 'A') {
				System.out.println(students);
			}
		}
	}
}
