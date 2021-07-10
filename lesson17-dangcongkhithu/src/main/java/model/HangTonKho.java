package model;

public class HangTonKho {
	private Integer maloai;
	private String tenloai;
	private String dsMatHangSoLuong;
	private Integer tongSoLuong;

	public HangTonKho() {
	}

	public HangTonKho(Integer maloai, String tenloai, String dsMatHangSoLuong, Integer tongSoLuong) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
		this.dsMatHangSoLuong = dsMatHangSoLuong;
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

}