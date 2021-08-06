package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public Item get(int id) {
		return itemDao.get(id);
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

}
