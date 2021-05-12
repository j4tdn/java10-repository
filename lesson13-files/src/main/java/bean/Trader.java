package bean;

import java.io.Serializable;

public class Trader implements Serializable, FileData {
	private static final long serialVersionUID = -2615810303544706342L;
	
	private final String name;
	private final String city;

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
	
	@Override
	public String toLine() {
		return city + ", " + name;
	}
	
	public static Trader transfer(String line) {
		String[] tmps = line.split(", ");
		if(tmps.length !=2 ) {
			return null;
		}
		return new Trader(tmps[1], tmps[0]);
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}

	
}

