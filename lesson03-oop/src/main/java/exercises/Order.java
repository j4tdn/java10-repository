package exercises;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import exercises.Customer;
import exercises.ItemInfo;

public class Order {
	private Customer customer;
	private ItemInfo[] iteminfos;
	private LocalDateTime dateTime;
	private double totalOfMoney;
	
	
	public Order() {
	}
	

	public Order(Customer customer, ItemInfo[] itemifos, LocalDateTime dateTime) {
		super();
		this.customer = customer;
		this.iteminfos = itemifos;
		this.dateTime = dateTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemInfo[] getIteminfos() {
		return iteminfos;
	}

	public void setItemifos(ItemInfo[] iteminfos) {
		this.iteminfos = iteminfos;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public double getTotalOfMoney() {
		return totalOfMoney;
	}
	
	public void setTotalOfMoney(double totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}
	
	
	
	
	
	
	
}
