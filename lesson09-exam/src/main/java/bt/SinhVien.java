package bt;

public class SinhVien {
	private int ma;
	private String name;
	private XepLoai xepLoai;

	public SinhVien() {

	}

	public SinhVien(int ma, String name, XepLoai xepLoai) {
		super();
		this.ma = ma;
		this.name = name;
		this.xepLoai = xepLoai;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public XepLoai getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(XepLoai xepLoai) {
		this.xepLoai = xepLoai;
	}

	public String toString() {
		return this.ma + " - " + this.name + " - " + this.xepLoai;
	}

}
