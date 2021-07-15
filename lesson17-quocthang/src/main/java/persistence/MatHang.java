package persistence;

import java.sql.Date;

public class MatHang {
	private Integer maMH;
	private String tenMH;
	private Integer giaBan;
	private Integer giaMua;
	private Date thoiGianDatHang;
	private Integer maLoai;

	public MatHang() {

	}

	public MatHang(Integer maMH, String tenMH, Integer giaBan, Integer giaMua, Date thoiGianDatHang, Integer maLoai) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.giaBan = giaBan;
		this.giaMua = giaMua;
		this.thoiGianDatHang = thoiGianDatHang;
		this.maLoai = maLoai;
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

	public Date getThoiGianDatHang() {
		return thoiGianDatHang;
	}

	public void setThoiGianDatHang(Date thoiGianDatHang) {
		this.thoiGianDatHang = thoiGianDatHang;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	@Override
	public String toString() {
		if (giaBan != null) {
			return "MatHang [maMH=" + maMH + ", tenMH=" + tenMH + ", giaBan=" + giaBan + "]";
		}
		return "MatHang [maMH=" + maMH + ", tenMH=" + tenMH + ", thoiGianDatHang=" + thoiGianDatHang + "]";
	}

}