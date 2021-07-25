package persistence;

// Không cần thiết phải tạo class này
// Xem review chỗ ItemDao dòng 55
public class Items2 {
	private String item;

	public Items2() {
	}

	public Items2(String item) {
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Tên MH:" + item + "";
	}
}
