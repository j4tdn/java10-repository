package Exercises;

public class Customer {
	private String cardId;
	private String fullname;
	private String phone;
	private String address;

	public Customer() {

	}

	public Customer(String cardId, String fullname, String phone, String address) {
		super();
		this.cardId = cardId;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cardId=" + cardId + ", fullname=" + fullname + ", phone=" + phone + ", address=" + address
				+ "]";
	}

}
