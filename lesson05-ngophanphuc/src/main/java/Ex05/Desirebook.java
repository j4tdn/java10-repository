package Ex05;

public class Desirebook {
	private String idstk;
	private String nxbdb;
	private double tax;
	private double costdb;
	
	
	@Override
	public String toString() {
		 return "Desirebook [idstk=" +idstk  + ", nxbdb=" + nxbdb + ", tax=" + tax + ", costdb=" + costdb + "]";

	}
	public Desirebook() {
		// TODO Auto-generated constructor stub
	}
	public Desirebook(String idstk, String nxbdb, double tax, double costdb) {
		super();
		this.idstk = idstk;
		this.nxbdb = nxbdb;
		this.tax = tax;
		this.costdb = costdb;
	}
	public String getIdstk() {
		return idstk;
	}
	public void setIdstk(String idstk) {
		this.idstk = idstk;
	}
	public String getNxbdb() {
		return nxbdb;
	}
	public void setNxbdb(String nxbdb) {
		this.nxbdb = nxbdb;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public double getCostdb() {
		return costdb;
	}
	public void setCostdb(double costdb) {
		this.costdb = costdb;
	}
	
	

}
