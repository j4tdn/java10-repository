package entity;

public class Product {

	private int MaMH;

	private String TenMH;

	private String MauSac;

	private String ChatLieu;

	private int GiaBan;
	
	public Product() {

	}

	public Product(int maMH, String tenMH, String mauSac, String chatLieu, int giaBan) {
		MaMH = maMH;
		TenMH = tenMH;
		MauSac = mauSac;
		ChatLieu = chatLieu;
		GiaBan = giaBan;
	}
	
	
	
	public int getMaMH() {
		return MaMH;
	}

	public void setMaMH(int maMH) {
		MaMH = maMH;
	}

	public String getTenMH() {
		return TenMH;
	}

	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}

	public String getMauSac() {
		return MauSac;
	}

	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}

	public String getChatLieu() {
		return ChatLieu;
	}

	public void setChatLieu(String chatLieu) {
		ChatLieu = chatLieu;
	}

	public int getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}

	@Override
	public String toString() {
		return "Product [MaMH=" + MaMH + ", TenMH=" + TenMH + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu
				+ ", GiaBan=" + GiaBan + "]";
	}

}
