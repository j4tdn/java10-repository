package persistence;

import java.util.Map;

public class ItemGroupDto {
private Integer igrId;
private String igrName;
private Map<String, Integer> items;  // itamName, amount
private Integer TotalOfItems;
public ItemGroupDto() {
}



public ItemGroupDto(Integer igrId, String igrName, Map<String, Integer> items, Integer totalOfItems) {
	super();
	this.igrId = igrId;
	this.igrName = igrName;
	this.items = items;
	TotalOfItems = totalOfItems;
}



public Integer getTotalOfItems() {
	return TotalOfItems;
}



public void setTotalOfItems(Integer totalOfItems) {
	TotalOfItems = totalOfItems;
}



public Integer getIgrId() {
	return igrId;
}

public void setIgrId(Integer igrId) {
	this.igrId = igrId;
}

public String getIgrName() {
	return igrName;
}

public void setIgrName(String igrName) {
	this.igrName = igrName;
}

public Map<String, Integer> getItems() {
	return items;
}

public void setItems(Map<String, Integer> items) {
	this.items = items;
}



@Override
public String toString() {
	return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", items=" + items + ", TotalOfItems="
			+ TotalOfItems + "]";
}







}