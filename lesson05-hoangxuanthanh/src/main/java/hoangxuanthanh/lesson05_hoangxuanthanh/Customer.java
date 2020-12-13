package hoangxuanthanh.lesson05_hoangxuanthanh;

public class Customer {
	public String id;
	public String name;
	public int number;
	public String address;
	public Customer(String id, String name, int number, String address) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
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
		return "Customer [id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	
	
	
}
