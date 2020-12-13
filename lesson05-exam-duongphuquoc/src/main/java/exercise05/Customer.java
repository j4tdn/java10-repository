package exercise05;

public class Customer {
	private String customerId;
	private String cusomterName;
	private int phoneNumber;
	private String address;

	public Customer() {
	}

	public String getCustomerId() {
		return customerId;
	}
	
	

	public Customer(String customerId, String cusomterName, int phoneNumber, String address) {
		super();
		this.customerId = customerId;
		this.cusomterName = cusomterName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCusomterName() {
		return cusomterName;
	}

	public void setCusomterName(String cusomterName) {
		this.cusomterName = cusomterName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cusomterName=" + cusomterName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}

	

}
