package bean;

public class HangTonKho {
	private Integer maLoai;
	private String tenLoai;
	private String danhSachMatHangVaSoLuong;
	private Integer tongSoLuong;
	
	public HangTonKho() {

	}

	public HangTonKho(Integer maLoai, String tenLoai, String danhSachMatHangVaSoLuong, Integer tongSoLuong) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.danhSachMatHangVaSoLuong = danhSachMatHangVaSoLuong;
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

	public String getDanhSachMatHangVaSoLuong() {
		return danhSachMatHangVaSoLuong;
	}

	public void setDanhSachMatHangVaSoLuong(String danhSachMatHangVaSoLuong) {
		this.danhSachMatHangVaSoLuong = danhSachMatHangVaSoLuong;
	}

	public Integer getTongSoLuong() {
		return tongSoLuong;
	}

	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	@Override
	public String toString() {
		return "HangTonKho [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", MatHang:SoLuong="
				+ danhSachMatHangVaSoLuong + ", tongSoLuong=" + tongSoLuong + "]";
	}
	
	

}
