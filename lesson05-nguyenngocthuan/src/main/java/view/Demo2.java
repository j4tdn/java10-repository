package view;

public class Demo2 {
	private String id;
	private long money;
	private String NXB;
	private String Status;
	public Demo2(String id, long money, String nXB, String status) {
		super();
		this.id = id;
		this.money = money;
		NXB = nXB;
		Status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Demo2 [id=" + id + ", money=" + money + ", NXB=" + NXB + ", Status=" + Status + "]";
	}
	
}
