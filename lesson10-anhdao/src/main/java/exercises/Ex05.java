package exercises;

import java.util.Arrays;

import java.util.Comparator;

public class Ex05 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 1, 7, 11, 11, 6, 14 };
		// 1. Sắp xếp Nổi bọt – Buble Sort
		bubblrSort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("==================================");
		// 2. Săp xếp Kiểu chọn – Selection Sort
		// 3. Sắp xếp Kiểu chèn – Insertion Sort
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("==================================");
		// 4. Sắp xếp các đối tượng – Object Sort
		Student [] students = getStudent();
		Arrays.sort(students, Comparator.comparing((Student t)-> t.getId()).thenComparing(Comparator.comparing((Student t)-> t.getAge())).reversed());
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("==================================");
	}

	private static void insertionSort(int[] digits) {
		for (int i = 1; i < digits.length; i++) {
			int key = digits[i];
			int j = i - 1;
			while (j >= 0 && digits[j] > key) {
				digits[j + 1] = digits[j];
				j = j - 1;
			}
			digits[j + 1] = key;
		}
	}

	private static void bubblrSort(int[] digits) {
		for (int out = digits.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (digits[in] > digits[out]) {
					int tmp = digits[out];
					digits[out] = digits[in];
					digits[in] = tmp;
				}
			}
		}
	}

	private static Student[] getStudent() {
		return new Student[] { 
				new Student(1, "An", 15), 
				new Student(2, "Ha", 23), 
				new Student(3, "Manh", 20),
				new Student(4, "Phuong", 30) };
	}

	private static class Student {
		private Integer id;
		private String name;
		private Integer age;

		public Student() {
		}

		public Student(Integer id, String name, Integer age) {
			super();
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
			return id + ", " + name + "," + age;
		}
	}
}
