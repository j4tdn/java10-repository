package view;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private double cost;

	// constructor
	// default:empty constructor
	public Car() {
		// initial memory in HEAD
	}
	
	public Car(String id,String color, String model, double cost) {
		this.id=id;
		this.color=color;
		this.model=model;
		this.cost=cost;
	}

	// methods
	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getmodel() {
		return model;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public double getcost() {
		return cost;
	}

	public void setcost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + cost;
	}
}
