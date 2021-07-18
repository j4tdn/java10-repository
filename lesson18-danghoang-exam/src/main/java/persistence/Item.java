package persistence;

import java.sql.Date;
import java.time.LocalDate;



public class Item {
	private Integer idItem;
	private String  nameItem;
	private Double saleIn;
	private Double saleOut;
	private Integer IdGroupItem;
	private LocalDate OrderTime;
	
	public Item() {
	}

	public Item(Integer idItem, String nameItem, LocalDate date) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		OrderTime = date;
	}
	
	public Item(Integer idItem, String nameItem, Double saleIn, Double saleOut, Integer idGroupItem) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.saleIn = saleIn;
		this.saleOut = saleOut;
		IdGroupItem = idGroupItem;
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

	public Integer getIdGroupItem() {
		return IdGroupItem;
	}

	public void setIdGroupItem(Integer idGroupItem) {
		IdGroupItem = idGroupItem;
	}

	public LocalDate getOrderTime() {
		return OrderTime;
	}

	public void setOrderTime(LocalDate orderTime) {
		OrderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", nameItem=" + nameItem + ", saleIn=" + saleIn + ", saleOut=" + saleOut
				+ ", IdGroupItem=" + IdGroupItem + ", OrderTime=" + OrderTime + "]";
	}

	
	

	
	
}