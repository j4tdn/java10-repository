package bean;

public class LoaiHang {
	private Integer maLoai;
	private String tenLoai;

	public LoaiHang() {

	}

	public LoaiHang(Integer maLoai, String tenLoai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	@Override
	public String toString() {
		return "LoaiHang [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}

}