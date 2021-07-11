package entity;

public class ProductIdAndMeanPrice {
	private int MaLoai;
	private double meanPrice;

	public ProductIdAndMeanPrice(int id, double meanPrice) {
		this.MaLoai = id;
		this.meanPrice = meanPrice;
	}

	public int getId() {
		return MaLoai;
	}

	public void setId(int id) {
		this.MaLoai = id;
	}

	public double getMeanPrice() {
		return meanPrice;
	}

	public void setMeanPrice(double meanPrice) {
		this.meanPrice = meanPrice;
	}

	@Override
	public String toString() {
		return "ProductIdAndMeanPrice [id=" + MaLoai + ", meanPrice=" + meanPrice + "]";
	}

}
