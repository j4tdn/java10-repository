package Ex05;

public class Textbook {
	private String idsgk;
	private String nxbtb;
	private String status;
	private double costsgk;

	
	 @Override
	public String toString() {
		 return "Textbook [Idsgk=" +idsgk  + ", nxbtb=" + nxbtb + ", status=" + status + ", costsgk=" + costsgk + "]";

	}
	 public Textbook() {
		// TODO Auto-generated constructor stub
	}
	public Textbook(String idsgk, String nxbtb, String status, double costsgk) {
		super();
		this.idsgk = idsgk;
		this.nxbtb = nxbtb;
		this.status = status;
		this.costsgk = costsgk;
	}
	public String getIdsgk() {
		return idsgk;
	}
	public void setIdsgk(String idsgk) {
		this.idsgk = idsgk;
	}
	public String getNxbtb() {
		return nxbtb;
	}
	public void setNxbtb(String nxbtb) {
		this.nxbtb = nxbtb;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getCostsgk() {
		return costsgk;
	}
	public void setCostsgk(double costsgk) {
		this.costsgk = costsgk;
	}
	

}
