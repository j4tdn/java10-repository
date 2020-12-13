package exercise05;

public class Main {
	public static void main(String[] args) {
		Customer customers = new Customer("CM01", "Phu Quoc", 012123345, "Quang Nam");
		Textbook[] textbooks = { new Textbook("SGK01", 20000, "NhiDong", "oldbook"),
				new Textbook("SGK02", 40000, "ThieuNien", "newbook") };
		TaxMustPaid taxMustPaid = new TaxMustPaid();
	}
}
