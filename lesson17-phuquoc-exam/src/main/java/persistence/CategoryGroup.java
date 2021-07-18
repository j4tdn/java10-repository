package persistence;

public class CategoryGroup {
	private Integer id;
	private String name;
	private Integer total;
	public CategoryGroup() {
		// TODO Auto-generated constructor stub
	}
	public CategoryGroup(Integer id, String name, Integer total) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CategoryGroup [id=" + id + ", name=" + name + ", total=" + total + "]";
	}
	
}
