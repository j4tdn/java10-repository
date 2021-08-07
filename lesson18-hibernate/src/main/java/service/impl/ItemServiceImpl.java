package service.impl;

import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.impl.ItemDaoImpl;
import persistence.Item;
import service.ItemService;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl();
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
	public void save(Item item) {
		Objects.requireNonNull(item);
		itemDao.save(item);
	}
}
