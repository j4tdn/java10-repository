package bean;

import java.io.Serializable;

public class Trader implements Serializable, FileData {
	private static final long serialVersionUID = 1L;
	
	private final String name;
	private final transient String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}
	
	public static Trader transfer(String line) {
		// Cambridge, Raoul
		String[] tmps = line.split(", ");
		if (tmps.length != 2) {
			return null;
		}
		return new Trader(tmps[1], tmps[0]);
	}
	
	@Override
	public String toLine() {
		return name + ", " + city;
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
}
