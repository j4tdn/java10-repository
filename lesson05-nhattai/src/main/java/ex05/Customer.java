package ex05;

public class Customer {
	private String idC;
	private String name;
	private double number;
	private String address;

	public Customer() {

	}

	public Customer(String idC, String name, double number, String address) {
		super();
		this.idC = idC;
		this.name = name;
		this.number = number;
		this.address = address;
	}

	public String getIdC() {
		return idC;
	}

	public void setIdC(String idC) {
		this.idC = idC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [idC=" + idC + ", name=" + name + ", number=" + number + ", address=" + address + "]";
	}

}
