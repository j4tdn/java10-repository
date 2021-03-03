package bean;

public class Item {
	private Integer id;
	private String name;
	

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String name, Integer id) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 @Override
	public boolean equals(Object o) {
		 if(this == o) {
			 return true;
		 }
		 if(!(o instanceof Item)) {
			 return false;
		 }
		 Item that = (Item)o;
		 return getId().equals(that.getId())&& getName().equals(that.getName());
	}
	
	
	@Override
	public String toString() {
		return  id + ", "+ name  ;
	}
	
}
