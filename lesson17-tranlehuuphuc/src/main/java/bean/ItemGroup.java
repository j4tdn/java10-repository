package bean;

import java.sql.Date;

public class ItemGroup {

	private Integer id;
	private String name;
	private Integer price;
	private Date date;

	public ItemGroup(Integer id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ItemGroup(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		if (price != null) {
			return "ItemGroup2 [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		return "ItemGroup2 [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}