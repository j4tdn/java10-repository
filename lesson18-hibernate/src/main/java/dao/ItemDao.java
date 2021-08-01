package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getAll();
	Item get(int id);
}
