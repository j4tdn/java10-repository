package exercisebonus;

public class Ex03 {
	public static void main(String[] args) {
		String studentList ="LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		String[] students = studentList.split(", ");
		for (String student : students) {
			if (student.startsWith("Le")) {
				System.out.println(student);
			}
		}
	}
}