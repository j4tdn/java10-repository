package persistence;

public class Staff {
	private Integer staffId;
	private String StaffName;
	private String email;
	private String address;
	private String phone;
	private String password;

	public Staff() {
	}

	public Staff(Integer staffId, String staffName, String email, String address, String phone, String password) {
		super();
		this.staffId = staffId;
		StaffName = staffName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.password = password;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return StaffName;
	}

	public void setStaffName(String staffName) {
		StaffName = staffName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
