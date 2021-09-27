package persistence;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

//1 class mapping all attribute in table => enity
//1 class not mapping all attribute in table => dto
// 1 class duoc get ra tu databse=>peristence
public class ItemGroupRawData {
	private Integer igrId;
	private String igrname;
	private String items; // itemName, amount
	private Integer totalOfItem;

	public ItemGroupRawData() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupRawData(Integer igrId, String igrname, String items, Integer totalOfItem) {
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

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Integer getTotalOfItem() {
		return totalOfItem;
	}

	public void setTotalOfItem(Integer totalOfItem) {
		this.totalOfItem = totalOfItem;
	}

	public ItemGroupDto transfer() {
		ItemGroupDto igrDto = new ItemGroupDto();
		igrDto.setIgrId(getIgrId());
		igrDto.setIgrname(getIgrname());
		String items = getItems();
		igrDto.setItems(Pattern.compile(",").splitAsStream(items)
				.collect(Collectors.toMap(item -> item.substring(0, item.lastIndexOf("-")),
						item -> Integer.parseInt(item.substring(item.lastIndexOf("-") + 1)))));
		igrDto.setTotalOfItem(getTotalOfItem());
		return igrDto;
	}

	@Override
	public String toString() {
		return "ItemGroupRawData [igrId=" + igrId + ", igrname=" + igrname + ", items=" + items + ", totalOfItem="
				+ totalOfItem + "]";
	}

}
