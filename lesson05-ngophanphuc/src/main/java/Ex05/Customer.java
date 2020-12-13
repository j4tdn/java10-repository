package Ex05;

public class Customer {
	private String Idcustomer;
	private String fullname;
	private String phone;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [Id=" +Idcustomer + ", fullname=" + fullname + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	public String getIdcustomer() {
		return Idcustomer;
	}
	public void setIdcustomer(String idcustomer) {
		Idcustomer = idcustomer;
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
	public Customer(String idcustomer, String fullname, String phone, String address) {
		super();
		Idcustomer = idcustomer;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}
	
	
	

}
