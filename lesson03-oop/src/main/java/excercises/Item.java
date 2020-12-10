package excercises;

public class Item {
	private String id;
	private String os;
	private Color color;
	private double price;
	
	public Item() {
	}

	public Item(String id, String os, Color color, double price) {
		this.id = id;
		this.os = os;
		this.color = color;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", os=" + os + ", color=" + color + ", price=" + price + "]";
	}

}
