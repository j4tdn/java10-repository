package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Order {
	private Customer customer;
	private ItemInfo[] itemInfos;
	private LocalDateTime datetime;
	private double totalOfMoney;
	
	public Order() {
	}

	public Order(Customer customer, ItemInfo[] itemInfos, LocalDateTime datetime) {
		this.customer = customer;
		this.itemInfos = itemInfos;
		this.datetime = datetime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemInfo[] getItemInfos() {
		return itemInfos;
	}

	public void setItemInfos(ItemInfo[] itemInfos) {
		this.itemInfos = itemInfos;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	public void setTotalOfMoney(double totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}
	
	public double getTotalOfMoney() {
		return totalOfMoney;
	}
	
	
}