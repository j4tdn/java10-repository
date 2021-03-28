package bean;

public class Apple {
	private int id;
	private String color;
	private String country;
	private double weight;

	public Apple() {
System.out.println(" apple => calling empty aaaaaa");
	}
	public Apple(String color) {
		System.out.println("apple => calling 1pr aaaaa");
	}

	public Apple(int id, String color, double weight, String country) {
		this.color = color;
		this.country = country;
		this.id = id;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", country=" + country + ", weight=" + weight + "]";
	}

}
