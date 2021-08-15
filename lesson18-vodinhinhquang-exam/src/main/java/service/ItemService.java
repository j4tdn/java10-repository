package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	List<Item> getItem(LocalDate date);
	List<Item> getAll();
	List<Item> getTopItems(Integer year, Integer limit);
}
