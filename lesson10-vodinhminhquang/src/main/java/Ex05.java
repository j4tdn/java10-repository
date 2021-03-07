import java.util.Arrays;
import java.util.Comparator;

import sorting.Utils;

public class Ex05 {
	public static void main(String[] args) {
		int[] numbers1 = {1, 20, 6, 2, 10, 8, 9, 4, 7, 19};
		int[] numbers2 = {4, 1, 7, 9, 6, 20, 4};
		int[] numbers3 = {25, 15, 30, 5, 19, 14, 7, 1, 2, 18};
		//Bubble Sort
		System.out.println("Bubble Sort");
		Utils.BubbleSort(numbers1);
		Ex01.printFor(numbers1);
		System.out.println("=======================");
		System.out.println("Selection Sort");
		Utils.SelectionSort(numbers2);
		Ex01.printFor(numbers2);
		System.out.println("=======================");
		System.out.println("Merge Sort");
		numbers3 = Utils.MergeSort(numbers3);
		Ex01.printFor(numbers3);
		System.out.println("=======================");

		// Object Sort
		Student[] students = getStudents();
		Arrays.sort(students, Comparator.comparing((Student t) -> t.getName()).thenComparing(t -> t.getAge()));
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private static Student[] getStudents() {
		return new Student[] { 
					new Student(1, "Adam", 20), 
					new Student(2, "Born", 19), 
					new Student(3, "Cell", 27),
					new Student(4, "Jack", 18), 
					new Student(5, "Adam", 19), 
					new Student(6, "Germain", 24),
					new Student(7, "Car", 19),
					new Student(8, "Jennie", 27),
					new Student(8, "Joe", 12)
					};
	}

	private static class Student {
		private Integer id;
		private String name;
		private Integer age;

		public Student() {

		}

		public Student(Integer id, String name, Integer age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return id + ", " + name + ", " + age;
		}
	}
}
