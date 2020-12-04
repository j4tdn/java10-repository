package exercises;

public class Customer {
	private String cardId;
	private String fullName;
	private String phone;
	private String address;

	public Customer() {
	}

	public Customer(String cardId, String fullName, String phone, String address) {
		super();
		this.cardId = cardId;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return "Customer [cardId=" + cardId + ", fullName=" + fullName + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
}