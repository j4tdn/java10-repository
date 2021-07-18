package persistence;

import java.util.Map;

public class ItemGroupDto {
private Integer igrId;
private String igrName;
private Integer TotalOfItems;
public ItemGroupDto() {
}

public ItemGroupDto(Integer igrId, String igrName, Integer totalOfItems) {
	super();
	this.igrId = igrId;
	this.igrName = igrName;
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
public Integer getTotalOfItems() {
	return TotalOfItems;
}
public void setTotalOfItems(Integer totalOfItems) {
	TotalOfItems = totalOfItems;
}

@Override
public String toString() {
	return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", TotalOfItems=" + TotalOfItems + "]";
}


}
