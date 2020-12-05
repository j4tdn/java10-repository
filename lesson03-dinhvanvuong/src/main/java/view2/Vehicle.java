package view2;


public class Vehicle {
	private String fullName;
	private String model;
	private int capacity;
	private double cost;

	public Vehicle() {
	}

	public Vehicle(String fullName, String model, int capacity, double cost) {
		this.fullName = fullName;
		this.model = model;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public double tax(int capacity,double cost) {
		if(capacity < 100) {
			return cost * (1/100);
		}if(capacity >= 100 && capacity <= 200) {
			return cost * (3/100);
			
		}
		return cost * (5/100);
	}
	@Override
	public String toString() {
		return fullName + "  "  + "\t\t " + model + "\t\t " + capacity + "\t\t " + cost + "\t\t " + tax(capacity, cost);
	}
	
	
	}

