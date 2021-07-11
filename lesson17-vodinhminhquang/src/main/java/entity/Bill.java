package entity;

public class Bill {

	private int MaDh;
	private int Total;

	public Bill(int maDh, int total) {
		MaDh = maDh;
		Total = total;
	}

	public Bill() {
	}

	public int getMaDh() {
		return MaDh;
	}

	public void setMaDh(int maDh) {
		MaDh = maDh;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "Bill [MaDh=" + MaDh + ", Total=" + Total + "]";
	}

}
