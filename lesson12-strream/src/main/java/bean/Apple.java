package bean;

public class Apple {
	private Integer id;
	private String color;
	private double weight;
	private String country;

	public Apple() {
		System.out.println("Apple -> calling empty constructor");
	}
	
	public Apple(String color) {
		System.out.println("Apple -> calling 1pr constructor");
	}
	
	public Apple(Integer id, String color, double weight, String country) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}
}	