package bean;

public class LoaiHang {
	private Integer maloai;
	private String tenloai;
	public LoaiHang() {
		// TODO Auto-generated constructor stub
	}
	public LoaiHang(Integer maloai, String tenloai) {
		this.maloai = maloai;
		this.tenloai = tenloai;
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
	@Override
	public String toString() {
		return "Mã loại: "+ maloai+ ", tên loại: "+tenloai;
	}
	
}
