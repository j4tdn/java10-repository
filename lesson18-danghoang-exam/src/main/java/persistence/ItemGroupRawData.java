package persistence;

import java.util.Map;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class ItemGroupRawData {
private Integer igrId;
private String igrName;
private String items;  // itamName, amount
private Integer TotalOfItems;
public ItemGroupRawData() {
}



public ItemGroupRawData(Integer igrId, String igrName, String items, Integer totalOfItems) {
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

public String getItems() {
	return items;
}

public void setItems(String items) {
	this.items = items;
}


 public ItemGroupDto transfer() {
	 ItemGroupDto itgrDto = new ItemGroupDto();
	 itgrDto.setIgrId(getIgrId());
	 itgrDto.setIgrName(getIgrName());
	 
itgrDto.setItems(java.util.regex.Pattern.compile(",")
	 .splitAsStream(getItems())
	 .collect(Collectors.toMap( item -> item.substring(0, item.indexOf("-")), 
			 					item -> Integer.parseInt(item.substring( item.indexOf("-")+1)))));
	 
	 itgrDto.setTotalOfItems(getTotalOfItems());;
	 return itgrDto;
 }
@Override
public String toString() {
	return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", items=" + items + ", TotalOfItems="
			+ TotalOfItems + "]";
}







}