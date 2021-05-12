package bean;

public class Transaction implements FileData{
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

	public String toLine() {
		return "[" + trader.toLine() + "] - " + year + " - " + value;
	}

	public static Transaction transfer(String line) {
		String[] tmps = line.split(" - ");
		if (tmps.length != 3) {
			return null;
		}
		String[] splittingTrader = tmps[0].split(", ");
		Trader trader = new Trader(splittingTrader[1].replace("]", ""),
				splittingTrader[0].replace("[", ""));
		return new Transaction(trader, Integer.parseInt(tmps[1]),
				Integer.parseInt(tmps[2]));
	}
	
	@Override
	public String toString() {
		return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "}";
	}
}
