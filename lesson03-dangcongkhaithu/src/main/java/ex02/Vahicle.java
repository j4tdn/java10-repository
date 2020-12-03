package ex02;

public class Vahicle {
	private String owner;
	private String type;
	private int capacity;
	private double price;

	public Vahicle() {
	}

	public Vahicle(String owner, String type, int capacity, double price) {
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double tax() {
		if (capacity < 100) {
			return (price * 1) / 100;
		} else if (capacity <= 200) {
			return (price * 3) / 100;
		}
		return price * 5 / 100;

	}

	@Override
	public String toString() {
		return "Vahicle [owner=" + owner + ", type=" + type + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax() + "]";
	}

}
