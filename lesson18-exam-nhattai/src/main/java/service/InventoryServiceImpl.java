package service;

import java.util.List;

import dao.HibernateInventoryDao;
import dao.HibernateItemDao;
import dao.InventoryDao;
import persistence.InventoryDto;

public class InventoryServiceImpl implements InventoryService{
	private InventoryDao inventoryDao;
	
	public InventoryServiceImpl() {
		inventoryDao = new HibernateInventoryDao();
	}

	@Override
	public List<InventoryDto> getItems() {
		return inventoryDao.getItems();
	}
	
}
