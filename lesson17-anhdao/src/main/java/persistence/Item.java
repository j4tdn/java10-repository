package persistence;

import java.sql.Date;

public class Item {
	private Integer idItem;
	private String  nameItem;
	private Double saleIn;
	private Double saleOut;
	private Integer IdGroupItem;
	private Date timeOrder;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer idItem, String nameItem, Double saleIn, Double saleOut, Integer idGroupItem, Date timeOrder) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.saleIn = saleIn;
		this.saleOut = saleOut;
		IdGroupItem = idGroupItem;
		this.timeOrder = timeOrder;
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

	public Date getTimeOrder() {
		return timeOrder;
	}

	public void setTimeOrder(Date timeOrder) {
		this.timeOrder = timeOrder;
	}
	
	
}
