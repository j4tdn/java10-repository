package persistence;

public class LoaiHang {
	private Integer maLoai;
	private String tenLoai;

	public LoaiHang() {
		// TODO Auto-generated constructor stub
	}

	public LoaiHang(Integer maLoai, String tenLoai) {
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}

	public Integer getmaLoai() {
		return maLoai;
	}

	public void setmaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public String gettenLoai() {
		return tenLoai;
	}

	public void settenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	@Override
	public String toString() {
		return "LoaiHang [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}

}