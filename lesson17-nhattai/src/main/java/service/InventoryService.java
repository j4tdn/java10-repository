package service;

import java.util.List;

import dao.InventoryDao;
import persistence.Inventory;

public class InventoryService {
	private InventoryDao inventoryDao;
	public InventoryService() {
		inventoryDao = new InventoryDao();
	}
	public List<Inventory> getAllInventory(){
		return inventoryDao.getAllInventory();
	}

}
