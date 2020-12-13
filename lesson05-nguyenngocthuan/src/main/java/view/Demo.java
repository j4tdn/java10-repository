package view;

public class Demo {
	private String MKH;
	private String name;
	private int SDT;
	private String DC;
	public Demo(String mKH, String name, int sDT, String dC) {
		super();
		MKH = mKH;
		this.name = name;
		SDT = sDT;
		DC = dC;
	}
	public String getMKH() {
		return MKH;
	}
	public void setMKH(String mKH) {
		MKH = mKH;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	public String getDC() {
		return DC;
	}
	public void setDC(String dC) {
		DC = dC;
	}
	@Override
	public String toString() {
		return "Demo [MKH=" + MKH + ", name=" + name + ", SDT=" + SDT + ", DC=" + DC + "]";
	}
	
}
