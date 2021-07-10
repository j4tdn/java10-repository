package bean;

import java.sql.Date;

public class MatHang {
	private Integer maMH;
	private String tenMH;
	private Integer giaBan;
	private Integer giaMua;
	private Integer maLoai;
	private Date thoiGianDatHang;

	public MatHang() {

	}
 
	public MatHang(Integer maMH, String tenMH, Integer giaBan) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.giaBan = giaBan;
	}

	public MatHang(Integer maMH, String tenMH, Date thoiGianDatHang) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.thoiGianDatHang = thoiGianDatHang;
	}

	public Integer getMaMH() {
		return maMH;
	}

	public void setMaMH(Integer maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public Integer getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(Integer giaBan) {
		this.giaBan = giaBan;
	}

	public Integer getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(Integer giaMua) {
		this.giaMua = giaMua;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public Date getThoiGianDatHang() {
		return thoiGianDatHang;
	}

	public void setThoiGianDatHang(Date thoiGianDatHang) {
		this.thoiGianDatHang = thoiGianDatHang;
	}

	@Override
	public String toString() {
		if (giaBan != null) {
			return "Mã mặt hàng: " + maMH + "  || Tên mặt hàng: " + tenMH + " || Giá bán: " + giaBan;
		}
		return "Mã mặt hàng: " + maMH + "  || Tên mặt hàng: " + tenMH + " || thời gian đặt hàng: " + thoiGianDatHang;

	}
}
