package Ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class NhanVien extends People {
private String donVi;
	
	public NhanVien() {
		
	}

	public NhanVien(String hoTen, LocalDate ngaySinh, int heSoLuong, String donVi) {
		super(hoTen, ngaySinh, heSoLuong);
		this.donVi = donVi;
	}
	
	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Override
	public long getLuong() {
		return getHeSoLuong() * 1250;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.print("Nhập đơn vị: ");
		donVi = new Scanner(System.in).nextLine();
	}
	
	@Override
	public String toString() {
		return "* [Nhân viên ] " + super.toString() + " - Đơn vị: " + donVi;
	}
}
