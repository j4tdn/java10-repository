package persistence;

import java.sql.Date;

public class ItemDto {
	private Integer IdGroupItem;
	private String nameGroupItem;
	private Integer idItem;
	private String  nameItem;
	private Double saleIn;
	private Double saleOut;
	private Integer TotalAmount;
	
public ItemDto() {
}

public ItemDto(Integer idGroupItem, String nameGroupItem, Integer idItem, String nameItem, Double saleIn,
		Double saleOut, Integer totalAmount) {
	super();
	IdGroupItem = idGroupItem;
	this.nameGroupItem = nameGroupItem;
	this.idItem = idItem;
	this.nameItem = nameItem;
	this.saleIn = saleIn;
	this.saleOut = saleOut;
	TotalAmount = totalAmount;
}

public Integer getIdGroupItem() {
	return IdGroupItem;
}

public void setIdGroupItem(Integer idGroupItem) {
	IdGroupItem = idGroupItem;
}

public String getNameGroupItem() {
	return nameGroupItem;
}

public void setNameGroupItem(String nameGroupItem) {
	this.nameGroupItem = nameGroupItem;
}

public Integer getIdItem() {
	return idItem;
}

public void setIdItem(Integer idItem) {
	this.idItem = idItem;
}

public String getNameItem() {
	return nameItem;
}

public void setNameItem(String nameItem) {
	this.nameItem = nameItem;
}

public Double getSaleIn() {
	return saleIn;
}

public void setSaleIn(Double saleIn) {
	this.saleIn = saleIn;
}

public Double getSaleOut() {
	return saleOut;
}

public void setSaleOut(Double saleOut) {
	this.saleOut = saleOut;
}

public Integer getTotalAmount() {
	return TotalAmount;
}

public void setTotalAmount(Integer totalAmount) {
	TotalAmount = totalAmount;
}

@Override
public String toString() {
	return "ItemDto [IdGroupItem=" + IdGroupItem + ", nameGroupItem=" + nameGroupItem + ", idItem=" + idItem
			+ ", nameItem=" + nameItem + ", saleIn=" + saleIn + ", saleOut=" + saleOut + ", TotalAmount=" + TotalAmount
			+ "]";
}


}
