package Ex02;

public class vehicle {
	private String vehicleOwnerName;
	private String rangeOfVehicle;
	private int capacity;
	private int price;

	public String getvehicleOwnerName(String vehicleOwnerName) {
		return vehicleOwnerName;
	}

	public void setvehicleOwnerName(String carOwnerName) {
		this.vehicleOwnerName = carOwnerName;
	}

	public String getrangeOfVehicle(String rangeOfVehicle) {
		return rangeOfVehicle;
	}

	public void setrangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
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
		return getvehicleOwnerName(vehicleOwnerName) + "\t\t\t" + getrangeOfVehicle(rangeOfVehicle) + "\t\t"
				+ getcapacity(capacity) + "\t\t" + getprice(price) + "\t\t\t" + taxMustPaid();
	}

	public double taxMustPaid() {
		if (capacity < 100) {
			return price * 1 / 100;
		} else if (capacity < 200) {
			return price * 3 / 100;
		}
		return price * 5 / 100;
	}
}
