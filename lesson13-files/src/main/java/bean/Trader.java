package bean;

public class Trader implements FileData {
	private final String name;
	private final String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	@Override
	public String toLine() {
		return city + ", " + name;
	}

	public static Trader transfer(String line) {
		// Cambridge, Raoul
		String[] tmps = line.split(", ");
		if (tmps.length != 2) {
			return null;
		}
		return new Trader(tmps[1], tmps[0]);
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
}