package ex04;

public class CompanyDemo {
	public static void main(String[] args) {
		People employee = new Employee("Dang Cong Khai Thu", "16.09.1999", 500, "Ve sinh");
		People manager = new Manager("Nguyen Thi Anh Thu", "24.05.1999", 500, 4);

		People[] peoples = { employee, manager };

		for (People people : peoples) {
			System.out.println(people);
		}
	}

}
