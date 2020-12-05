package lesson03;

import java.util.Scanner;

public class Ex02 {
	
	
	
	private String chuxe;
	private String loaixe;
	private int dungtich;
	private double trigia;
	private double thue;

	public String getChuXe() {
		return chuxe;
	}

	public void setChuXe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaiXe() {
		return loaixe;
	}

	public void setLoaiXe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungTich() {
		return dungtich;
	}

	public void setDungTich(int dungtich) {
		this.dungtich = dungtich;
	}

	public double getTriGia() {
		return trigia;
	}

	public void setTriGia(double trigia) {
		this.trigia = trigia;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public void nhapXe() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		System.out.println("Chu xe: ");
		chuxe = ip.nextLine();
		System.out.println("Loai xe: ");
		loaixe = ip.nextLine();
		System.out.println("Dung tich: ");
		dungtich = Integer.parseInt(ip.nextLine());
		System.out.println("Tri gia: ");
		trigia = Double.parseDouble(ip.nextLine());
		tinhThue();
	}

	public void tinhThue() {
		if (dungtich < 100) {
			thue = trigia / 100;
		} else if (dungtich >= 100 && dungtich <= 200) {
			thue = (trigia / 100) * 3;
		} else {
			thue = (trigia / 100) * 5;
		}
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}
}

