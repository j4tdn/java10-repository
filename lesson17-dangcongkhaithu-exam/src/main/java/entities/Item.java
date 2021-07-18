package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Item {
	private Integer id;
	private String name;
	private LocalTime orderTimne;

	public Item() {
	}

	public Item(Integer id, String name, LocalTime orderTimne) {
		this.id = id;
		this.name = name;
		this.orderTimne = orderTimne;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getOrderTimne() {
		return orderTimne;
	}

	public void setOrderTimne(LocalTime orderTimne) {
		this.orderTimne = orderTimne;
	}

}
