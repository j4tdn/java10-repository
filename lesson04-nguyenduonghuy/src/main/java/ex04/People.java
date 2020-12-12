package ex04;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public abstract class People {
	private static Scanner sc = new Scanner(System.in);
	
	private String hoTen;
	private LocalDate ngaySinh;
	private int heSoLuong;
	
	public People() {
		hoTen = "";
		ngaySinh = LocalDate.of(2020, 01, 01);
		heSoLuong = 0;
	}

	public People(String hoTen, LocalDate ngaySinh, int heSoLuong) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public abstract long getLuong();
	
	public void input() {
		System.out.print("Nhập họ tên: ");
		hoTen = new Scanner(System.in).nextLine();
		System.out.print("Nhập ngày tháng năm sinh: (yy/MM/dd)");
		ngaySinh = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("Nhập hệ số lương: ");
		heSoLuong = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Họ tên: " + hoTen + " - Ngày sinh: " + ngaySinh + " - Hệ số lương: " + heSoLuong;
	}
}