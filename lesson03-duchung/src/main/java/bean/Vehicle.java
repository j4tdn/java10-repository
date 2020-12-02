package bean;

public class Vehicle {
	private String carOwnerName;
	private String types;
	private int capacity;
	private int price;

	public Vehicle() {
		
	}
	public String getCarOwnerName(String carOwnerName) {
		return carOwnerName;
	}
	
	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}
	public String getTypes(String types) {
		return types;
	}
	
	public void setTypes(String types) {
		this.types = types;
	}
	public int getCapacity(int capacity) {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice(int price) {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  getCarOwnerName(carOwnerName) + "\t\t\t\t" +getTypes(types) + "\t\t" +getCapacity(capacity) + "\t\t" +getPrice(price) + "\t\t\t" +taxPayment();
	}
	
	public double taxPayment() {
		if(capacity<100) {
			return price*1/100; 
		}
		else if (capacity<200) {
			return price*3/100;
		}
		return price*5/100;
	}
}
