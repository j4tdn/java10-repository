package ex01;

public class Ex01 {
	public static void main(String[] args) {
		Student[] books = getAll();
		printf(books);
	}
  private static Student[] getAll() {
	  Student t1 = new Student("102","Nam",Enum.A);
	  Student t2 = new Student("104","Hoang",Enum.D);
	  Student t3 = new Student("109","Lan",Enum.A);
	  Student t4 = new Student("109","Lan",Enum.A);
		return new Student[] { t1, t2, t3,t4 };
	}
  private static void printf(Student[] books) {
		for (Student book : books) {
			System.out.println(book);
		}
	}
}

