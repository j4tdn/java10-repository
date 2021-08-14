package service;

import java.util.List;

import persistence.InventoryDto;

public interface InventoryService {
	List<InventoryDto> getInventory();
}