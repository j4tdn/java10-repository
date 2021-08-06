package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

	@Override
	public Item get(int id) {
		return itemDao.get(id);
	}

	@Override
	public boolean save(Item item) {
		Objects.requireNonNull(item, "item can not be null");
		return itemDao.save(item);
	}
	
	

}
