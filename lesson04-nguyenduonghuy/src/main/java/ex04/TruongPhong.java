package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class TruongPhong extends People {
	private int soLuongNhanVien;
	
	public TruongPhong() {
		super();
		soLuongNhanVien = 0;
	}
	
	public TruongPhong(String hoTen, LocalDate ngaySinh, int heSoLuong, int soLuongNhanVien) {
		super(hoTen, ngaySinh, heSoLuong);
		this.soLuongNhanVien = soLuongNhanVien;
	}
	
	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}

	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}

	@Override
	public long getLuong() {
		return getHeSoLuong() * 2200;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.print("Nhập số lượng nhân viên quản lí: ");
		soLuongNhanVien = new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "* Trưởng phòng * " + super.toString() + " - Số lượng nhân viên: " + soLuongNhanVien;
	}
}
