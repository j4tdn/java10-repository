package bean;

public class Grade {
	private String id;
	private String name;

	public Grade() {
		// TODO Auto-generated constructor stub
	}

	public Grade(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id.toString() +","+name.toString();
	}

}
