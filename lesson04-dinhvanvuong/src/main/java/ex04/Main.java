package ex04;

public class Main {
	public static void main(String[] args) {
	People emp1 = new Employee("Hoàng Xuân Thành", "12-2-1999",1,1, "Programmer");
	People emp2 = new Employee("Dương Quốc Bảo", "10-05-1995",2,2, "Programmer");
	People dir = new President("Hoàng Xuân Thành", "12-2-1999",2,4);
	People mg = new Manager("Dương Quốc Bảo", "10-05-1995",2,2, "Programmer");
	People[] arr = {emp1, emp2, dir, mg};
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
}
}
