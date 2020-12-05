package hoangxuanthanh.lesson03_hoangxuanthanh;

public class Vehicle {
	private String name;
	private String species;
	private int capacity;
	private long value;
	private long tax;
	int price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String species, int capacity, long value, long tax) {
		this.name = name;
		this.species = species;
		this.capacity = capacity;
		this.value = value;
		this.tax = tax;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return name  +species  +   +capacity+      "\t" +value+ "\t"  +tax;
	}

	

	
}
	
