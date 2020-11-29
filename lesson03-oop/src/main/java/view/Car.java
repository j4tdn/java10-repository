package view;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private double cost;

	// constructor
//default :empty constructor
	 public Car() {
	// initial memory in HEAP
	}

	public Car(String id, String color, String model, double cost) {
		this.id = id;
		this.color = color;
		this.model = model;
		this.cost = cost;
	}

//methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return id + "," + color + "." + model + "," + cost;
	}
}
