package view;

public class Car {
	// attributes : thuoc tinh

	private String color;
	private String id;
	private String model;
	private double cost;

	// constructor
	// default: empty constructor
	public Car() {
		// initial memory in HEAP
	}

	public Car(String id, String color, String model, double cost) {
		this.color = color; // gan gia tri cho tung thuoc tinh cua doi tuong this: doi tuong hien tai dang
							// goi den method trong class
		this.id = id;
		this.model = model;
		this.cost = cost;
	}

	// method
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
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

	@Override
	public String toString() {

		return id + " ," + model + " ," + color + ", " + cost;
	}

}