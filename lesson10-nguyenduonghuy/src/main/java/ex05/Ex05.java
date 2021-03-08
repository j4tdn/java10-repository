package ex05;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
	public static void main(String[] args) {
		Student[] listStudent = getStudent();
		
		sort(listStudent);
		
		printf(listStudent);
		
	}
	
	private static Student[] getStudent() {
		return new Student[] {
			new Student(1, "Huy", 21),
			new Student(2, "Quang", 18),
			new Student(null, "Quyen", 30),
			new Student(),
			new Student(4, "Ngan", 21),
			new Student(4, "Binh", 20),
			new Student(5, "Anh", null),
			new Student(6, null, 25)
		};
	}
	
	private static void printf(Student[] listStudent) {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}
	
	private static void sort(Student[] listStudent) {
		Comparator<Student> com = new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getId() == null) {
					return -1;
				}
				if (s2.getId() == null) {
					return 1;
				}
				return s1.getId().compareTo(s2.getId());
			}
		}. thenComparing(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getName() == null) {
					return -1;
				}
				if (s2.getName() == null) {
					return 1;
				}
				return s1.getName().compareTo(s2.getName());
			}
		}).thenComparing(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getAge() == null) {
					return -1;
				}
				if (s2.getAge() == null) {
					return 1;
				}
				return s1.getAge().compareTo(s2.getAge());
			}
		});
		Arrays.sort(listStudent, Comparator.nullsFirst(com));
	}
}
