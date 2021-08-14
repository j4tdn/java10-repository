package persistence;

public class ItemTop {
	
	public static final String NAME = "name";
	
	private String name;

	public ItemTop() {
	}

	public ItemTop(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getName() {
		return NAME;
	}

	@Override
	public String toString() {
		return "ItemTop [name=" + name + "]";
	}
	
	
	
}
