package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoAmount;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<Item> getAll() {

		return itemDao.getAll();
	}

	@Override
	public List<ItemDto> getItemDtos(LocalDate date) {
		return itemDao.getItemDtos(date);
	}

	@Override
	public List<ItemDtoAmount> getTopThree(int year) {
		return itemDao.getTopThree(year);
	}


}
