package exercises;

public class Customer {
	private String cardId;
	private String fullname;
	private String phone;
	private String address;
	
	
	@Override
	public String toString() {
		return "Customer [cardId=" + cardId + ", fullname=" + fullname + ", phone=" + phone + ", address=" + address
				+ "]";
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cardId, String fullname, String phone, String address) {
		super();
		this.setCardId(cardId);
		this.setFullname(fullname);
		this.setPhone(phone);
		this.setAddress(address);
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
	

}
