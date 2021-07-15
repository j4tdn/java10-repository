package persistence;

public class HangTonKho {
	private Integer id;
	private String name;
	private String listMHSL;
	private Integer sum;

	public HangTonKho() {
	}

	public HangTonKho(Integer id, String name, String listMHSL, Integer sum) {
		super();
		this.id = id;
		this.name = name;
		this.listMHSL = listMHSL;
		this.sum = sum;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getlistMHSL() {
		return listMHSL;
	}

	public void setlistMHSL(String listMHSL) {
		this.listMHSL = listMHSL;
	}

	public Integer getsum() {
		return sum;
	}

	public void setsum(Integer sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Mã loại: " + id + ", tên loại: " + name + ", DS[MatHang:SoLuong]: " + listMHSL
				+ ", tổng số lượng: " + sum;
	}
}
