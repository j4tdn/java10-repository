package ex05;

public class SGK {
	private String id;
	private int cost;
	private String publishCompany;
	private status status;
	public static enum status { NEW, OLD;}

	public SGK(String id, int cost, String publishCompany, String status) {
		super();
		this.id = id;
		this.cost = cost;
		this.publishCompany = publishCompany;
	}

	public SGK() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = "SGK" + id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPublishCompany() {
		return publishCompany;
	}

	public void setPublishCompany(String publishCompany) {
		this.publishCompany = publishCompany;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
