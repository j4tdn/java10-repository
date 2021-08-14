package service;

import java.util.List;

import dao.HibernateInventoryDao;
import dao.InventoryDao;
import persistence.InventoryDto;

public class InventoryServiceImpl implements InventoryService{
	
	private InventoryDao inventoryDao;

	public InventoryServiceImpl() {
		inventoryDao = new HibernateInventoryDao();
	}

	@Override
	public List<InventoryDto> getInventory() {
		return inventoryDao.getInventory();
	}

}
