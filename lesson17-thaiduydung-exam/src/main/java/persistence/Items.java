package persistence;

public class Items {
	private String item;
	public Items() {
		// TODO Auto-generated constructor stub
	}

	public Items(String item) {
		super();
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
		return "Item [item=" + item + "]";
	}

}
