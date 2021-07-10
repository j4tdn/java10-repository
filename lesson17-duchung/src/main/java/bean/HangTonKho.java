package bean;

public class HangTonKho {
	private Integer maloai;
	private String tenloai;
	private String danhSachMatHangvaSoLuong;
	private Integer tongSoLuong;

	public HangTonKho() {
		// TODO Auto-generated constructor stub
	}

	public HangTonKho(Integer maloai, String tenloai, String danhSachMatHangvaSoLuong, Integer tongSoLuong) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
		this.danhSachMatHangvaSoLuong = danhSachMatHangvaSoLuong;
		this.tongSoLuong = tongSoLuong;
	}

	public Integer getMaloai() {
		return maloai;
	}

	public void setMaloai(Integer maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	public String getDanhSachMatHangvaSoLuong() {
		return danhSachMatHangvaSoLuong;
	}

	public void setDanhSachMatHangvaSoLuong(String danhSachMatHangvaSoLuong) {
		this.danhSachMatHangvaSoLuong = danhSachMatHangvaSoLuong;
	}

	public Integer getTongSoLuong() {
		return tongSoLuong;
	}

	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	@Override
	public String toString() {
		return "Mã loại: " + maloai + ", tên loại: " + tenloai + ", DS[MatHang:SoLuong]: " + danhSachMatHangvaSoLuong
				+ ", tổng số lượng: " + tongSoLuong;
	}
}
