package exercies;

public class Customer {
	private String cardID;
	private String fullName;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}

	public Customer(String cardID, String fullName, String phoneNumber, String address) {
		this.cardID = cardID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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
		return "Customer [cardID=" + cardID + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
}