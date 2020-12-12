package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class GiamDoc extends People {
	private int heSoChucVu;
	
	public GiamDoc() {
		super();
		heSoChucVu = 0;
	}

	public GiamDoc(String hoTen, LocalDate ngaySinh, int heSoLuong, int heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public int getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	public long getLuong() {
		return (getHeSoLuong() + heSoChucVu) * 3000;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.print("Nhập hệ số chức vụ: ");	
		heSoChucVu = new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "* Giám đốc * " + super.toString() + " - Hệ số chức vụ: " + heSoChucVu;
	}
}
