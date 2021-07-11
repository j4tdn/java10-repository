package entity;

public class ProductType3 {

	private int MaLoai;

	private String TenLoai;

	private String GroupProductAndQuantity;

	private int TotalByIdType;

	public ProductType3(int maLoai, String tenLoai, String groupProductAndQuantity, int totalByIdType) {
		MaLoai = maLoai;
		TenLoai = tenLoai;
		GroupProductAndQuantity = groupProductAndQuantity;
		TotalByIdType = totalByIdType;
	}

	public int getMaLoai() {
		return MaLoai;
	}

	public void setMaLoai(int maLoai) {
		MaLoai = maLoai;
	}

	public String getTenLoai() {
		return TenLoai;
	}

	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}

	public String getGroupProductAndQuantity() {
		return GroupProductAndQuantity;
	}

	public void setGroupProductAndQuantity(String groupProductAndQuantity) {
		GroupProductAndQuantity = groupProductAndQuantity;
	}

	public int getTotalByIdType() {
		return TotalByIdType;
	}

	public void setToTalByIdType(int totalByIdType) {
		TotalByIdType = totalByIdType;
	}

	@Override
	public String toString() {
		return "ProductType3 [MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + ", GroupProductAndQuantity="
				+ GroupProductAndQuantity + ", ToTalByIdType=" + TotalByIdType + "]";
	}

}
