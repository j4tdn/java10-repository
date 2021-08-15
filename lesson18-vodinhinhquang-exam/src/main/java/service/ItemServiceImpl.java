package service;

import java.time.LocalDate;
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
	public List<Item> getItem(LocalDate date) {
		return itemDao.getItem(date);
	}

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

	@Override
	public List<Item> getTopItems(Integer year, Integer limit) {
		return itemDao.getTopItems(year, limit);
	}

}
