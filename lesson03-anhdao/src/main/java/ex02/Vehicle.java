package ex02;

public class Vehicle {
	private String ownerName;
	private String type;
	private double capacity;
	private double cost;

	public Vehicle() {
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double taxVehicle() {
		if (capacity < 100) {
			return cost * 1 / 100;
		} else if (capacity <= 200) {
			return cost * 3 / 100;
		}
		return cost * 5 / 100;

	}

	public Vehicle(String ownerName, String type, double capacity, double cost) {

		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getType() {
		return type;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getCost() {
		return cost;
	}

	public String toString() {
		return ownerName + "\t\t\t" + type + "\t\t\t" + capacity + "t\t\t" + cost + "t\t\t" + taxVehicle();
	}
}
