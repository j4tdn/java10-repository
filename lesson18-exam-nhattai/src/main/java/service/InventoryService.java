package service;

import java.util.List;

import persistence.InventoryDto;

public interface InventoryService {
	public List<InventoryDto> getItems();
}
