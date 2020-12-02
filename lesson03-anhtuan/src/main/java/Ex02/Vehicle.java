package Ex02;

public class Vehicle {
	private String carownername;
	private String rangeofvehicle;
	private int capacity;
	private int price;

	public String getcarownername(String carownername) {
		return carownername;
	}

	public void setcarownername(String carownername) {
		this.carownername = carownername;
	}

	public String getrangeofvehicle(String rangeofvehicle) {
		return rangeofvehicle;
	}

	public void setrangeofvehicle(String rangeofvehicle) {
		this.rangeofvehicle = rangeofvehicle;
	}

	public int getcapacity(int capacity) {
		return capacity;
	}

	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getprice(int price) {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getcarownername(carownername) + "\t\t" + getrangeofvehicle(rangeofvehicle) + "\t\t\t"
				+ getcapacity(capacity) + "\t\t" + getprice(price) + "\t\t\t" + taxmustpaid();
	}

	public double taxmustpaid() {
		if (capacity < 100) {
			return price * 1 / 100;
		} else if (capacity < 200) {
			return price * 3 / 100;
		}
		return price * 5 / 100;
	}

}
