package persistence;

import java.util.Map;

//1 class mapping all attribute in table => enity
//1 class not mapping all attribute in table => dto
// 1 class duoc get ra tu databse=>peristence
public class  ItemGroupDto{
	private Integer igrId;
	private String igrname;
	private Map<String, Integer> items; // itemName, amount
	private Integer totalOfItem;

	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer igrId, String igrname, Map<String, Integer> items, Integer totalOfItem) {
		super();
		this.igrId = igrId;
		this.igrname = igrname;
		this.items = items;
		this.totalOfItem = totalOfItem;
	}

	public Integer getIgrId() {
		return igrId;
	}

	public void setIgrId(Integer igrId) {
		this.igrId = igrId;
	}

	public String getIgrname() {
		return igrname;
	}

	public void setIgrname(String igrname) {
		this.igrname = igrname;
	}

	public Map<String, Integer> getItems() {
		return items;
	}

	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}

	public Integer getTotalOfItem() {
		return totalOfItem;
	}

	public void setTotalOfItem(Integer totalOfItem) {
		this.totalOfItem = totalOfItem;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igrId=" + igrId + ", igrname=" + igrname + ", items=" + items + ", totalOfItem="
				+ totalOfItem + "]";
	}
	

}
