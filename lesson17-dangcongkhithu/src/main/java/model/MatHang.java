package model;

import java.util.Date;

public class MatHang {
	private Integer maMH;
	private String tenMH;
	private Double giaBan;
	private Double giaMua;
	private Integer maLoai;
	private Date thoigianDatHang;

	public MatHang() {
	}

	public MatHang(Integer maMH, String tenMH, Double giaBan, Double giaMua, Integer maLoai, Date thoigianDatHang) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.giaBan = giaBan;
		this.giaMua = giaMua;
		this.maLoai = maLoai;
		this.thoigianDatHang = thoigianDatHang;
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

	public Double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(Double giaBan) {
		this.giaBan = giaBan;
	}

	public Double getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(Double giaMua) {
		this.giaMua = giaMua;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public Date getThoigianDatHang() {
		return thoigianDatHang;
	}

	public void setThoigianDatHang(Date thoigianDatHang) {
		this.thoigianDatHang = thoigianDatHang;
	}

}