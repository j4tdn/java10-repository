package bean;

public class Grade {
	private String id;
	private String name;

	public Grade() {

	}

	public Grade(String id, String name) {
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
		return "Grade [id=" + id + ", name=" + name + "]";
	}

}
