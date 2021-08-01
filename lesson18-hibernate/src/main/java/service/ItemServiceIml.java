package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceIml implements ItemService {
	private ItemDao ItemDao;
	
	public ItemServiceIml() {
		ItemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return ItemDao.getAll();
	}

	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		return ItemDao.get(id);
	}
	

}
