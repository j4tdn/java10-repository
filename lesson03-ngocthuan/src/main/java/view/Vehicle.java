package view;

public class Vehicle {
	private String id;
	private String name;
	private int capacity;
	private long Cost;
	private long tax;
	
	public Vehicle() {

		}

	public Vehicle(String id, String name, int capacity, long cost, long tax) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		Cost = cost;
		this.tax = tax;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public long getCost() {
		return Cost;
	}

	public void setCost(long cost) {
		Cost = cost;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}
	 public String toString() {
		 return id   +name   +   +capacity+         "\t"     +Cost+ "\t"  +tax ;
	 }
}
