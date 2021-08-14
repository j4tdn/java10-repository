package persistence;

public class ItemGroupDto {
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String NUMBER = "number";
	private Integer id;
	private String name;
	private Integer number;

	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer id, String name, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", number=" + number + "]";
	}

}
