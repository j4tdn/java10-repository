package encapsulation.inside;

import java.time.LocalDate;

public class Department {
	public static void main(String[] args) {
		Company comp = new Company();
		comp.setBalance(100);
		comp.compId = "X102";
		comp.numberOfEmps = 100;
		LocalDate.now();
	}
}
