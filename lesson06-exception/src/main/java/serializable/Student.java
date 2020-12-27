package serializable;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = -4418844657571329135L;
	
	private transient String id;
	private transient String name;
	
	public Student() {
	}

	public Student(String id, String name) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
