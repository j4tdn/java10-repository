package bean;

public class Transaction implements FileData {
	private final Trader trader;
	private final int year;
	private final int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return this.trader;
	}

	public int getYear() {
		return this.year;
	}

	public int getValue() {
		return this.value;
	}
	
	public static Transaction transfer(String line) {
		// [Cambridge, Brian] - 2011 - 300
		String[] tmps = line.split(" - ");
		if (tmps.length != 3) {
			return null;
		}
		String[] arr = tmps[0].split(", "); // [Cambridge, Brian]
		Trader trader = new Trader(arr[0].replace("[", ""), arr[1].replace("]", ""));
		return new Transaction(trader, Integer.parseInt(tmps[1]), Integer.parseInt(tmps[2]));
	}

	@Override
	public String toLine() {
		return "[" + trader.toLine() + "]" + " - " + year + " - " + value;
	}
	
	public String toString() {
		return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "}";
	}
}
