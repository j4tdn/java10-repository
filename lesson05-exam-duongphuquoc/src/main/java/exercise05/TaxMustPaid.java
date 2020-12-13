package exercise05;

public class TaxMustPaid {
	Textbook tb = new Textbook();
	ReferBook rb = new ReferBook();

	public double taxMustPaidTextBook() {
		if (tb.getCondition() == "oldbook") {
			return tb.getPrice() * 30 / 100;
		} else {
			return tb.getPrice();
		}
	}

	public double taxMustPaidReferBook() {
		return rb.getPrice() * (1 + (rb.getTax() / 100));
	}
}
