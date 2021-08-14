package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	
	List<Item> getAll();
	
	List<String> getQuantity(int year, int limit);

	List<Item> get(LocalDate date);
}
