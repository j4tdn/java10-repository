package exercise02;

public class Vehicle {
	private String name;
	private String model;
	private int volume;
	private long price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

	
	public Vehicle() {
	}
	
	public Vehicle(String name, String model, int volume, double price) {
		this.name = name;
		this.model = model;
		this.volume = volume;
		this.price = price;
	}
	
	public static long priceAfterTax(int volume, long price) {
		if(volume < 100) {
			return Math.round((price * 0.01) * 100 / 100) ;
		}
		if(volume >= 100 && volume <= 200) {
			return Math.round((price * 0.03) * 100 / 100);
		}
		return Math.round(((price * 0.05) * 100) / 100);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "  "  + "\t\t " + model + "\t\t " + volume + "\t\t " + price + "\t\t " + priceAfterTax(volume, price);
	}
}
