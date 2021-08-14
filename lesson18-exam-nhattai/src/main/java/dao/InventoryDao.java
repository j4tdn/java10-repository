package dao;

import java.util.List;

import persistence.InventoryDto;

public interface InventoryDao {
	List<InventoryDto> getItems();
	
}
