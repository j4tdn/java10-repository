package persistence;

public class Inventory {
	private Integer maLoai;
	private String tenLoai;
	private String dsMatHangSoLuong;
	private Integer tongSoLuong;

	public Inventory() {
	}

	public Inventory(Integer maLoai, String tenLoai, String dsMatHangSoLuong, Integer tongSoLuong) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.dsMatHangSoLuong = dsMatHangSoLuong;
		this.tongSoLuong = tongSoLuong;
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

	public String getDsMatHangSoLuong() {
		return dsMatHangSoLuong;
	}

	public void setDsMatHangSoLuong(String dsMatHangSoLuong) {
		this.dsMatHangSoLuong = dsMatHangSoLuong;
	}

	public Integer getTongSoLuong() {
		return tongSoLuong;
	}

	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	@Override
	public String toString() {
		return "Mã loại: " + maLoai + ", tên loại: " + tenLoai + ", DS[MatHang:SoLuong]: " + dsMatHangSoLuong
				+ ", tổng số lượng: " + tongSoLuong;
	}

}
