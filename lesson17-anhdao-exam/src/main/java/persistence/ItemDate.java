package persistence;

import java.sql.Date;
import java.time.LocalTime;

public class ItemDate {
	private Integer idItem;
	private String  nameItem;
	private LocalTime OrderTime;
	
	public ItemDate() {
	}

	public ItemDate(Integer idItem, String nameItem, LocalTime orderTime) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		OrderTime = orderTime;
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

	public LocalTime getOrderTime() {
		return OrderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		OrderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemDate [idItem=" + idItem + ", nameItem=" + nameItem + ", OrderTime=" + OrderTime + "]";
	}
	
	
}
