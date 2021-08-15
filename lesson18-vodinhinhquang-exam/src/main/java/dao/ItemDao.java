package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {

	List<Item> getItem(LocalDate date);

	List<Item> getAll();

	List<Item> getTopItems(Integer year, Integer limit);
}
