package persistence;

public class Staff {
	private Integer staffId;
	private String staffName;
	private String email;
	private String address;
	private String phone;
	private String pass;
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(Integer staffId, String staffName, String email, String address, String phone, String pass) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.pass = pass;
	}
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
