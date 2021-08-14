package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDAO {
	
	List<Item> getAll();
	
	List<Item> getQuantity(int year, int limit);
	
	List<Item> get(LocalDate date);
	
}
