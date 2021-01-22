package exNew;

public class Ex03Student {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		String[] elements = students.split(", ");
		for (String element : elements) {
			if (element.startsWith("Le")) {
				System.out.println(element);
			}
		}
	}
}
