package persistence;

public class HangTonKho {
	private Integer maloai;
	private String tenloai;
	private String listMatHangSoLuong;
	private Integer tongSoLuong;
	public HangTonKho() {
	}
	public HangTonKho(Integer maloai, String tenloai, String listMatHangSoLuong, Integer tongSoLuong) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
		this.listMatHangSoLuong = listMatHangSoLuong;
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
	public String getListMatHangSoLuong() {
		return listMatHangSoLuong;
	}
	public void setListMatHangSoLuong(String listMatHangSoLuong) {
		this.listMatHangSoLuong = listMatHangSoLuong;
	}
	public Integer getTongSoLuong() {
		return tongSoLuong;
	}
	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}
	@Override
	public String toString() {
		return "SoLuongHangTonKhoCuaMoiLoaiHang [MaLoai=" + maloai + ", TenLoai=" + tenloai + ", DS:[" + listMatHangSoLuong
				+ "], TongSoLuong=" + tongSoLuong + "]";
	}
	
}
