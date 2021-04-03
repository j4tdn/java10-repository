package bean;

public class Apple {
	private int id;
	private String color;
	private int weight;
	private String country;
	
	public Apple() {
		System.out.println("Calling empty contructor");
	}
	
	public Apple(String color) {
		this.color = color;
		System.out.println("Calling 1param contructor");
	}
	
	public Apple(int id, String color, int weight, String country) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
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
