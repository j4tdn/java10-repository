package ex05;

public class Customer {
	private String idCustomer;
	private String userName;
	private int phone;
	private String adress;

	public Customer() {
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Customer(String idCustomer, String userName, int phone, String adress) {
		super();
		this.idCustomer = idCustomer;
		this.userName = userName;
		this.phone = phone;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", userName=" + userName + ", phone=" + phone + ", adress="
				+ adress + "]";
	}
    
}
