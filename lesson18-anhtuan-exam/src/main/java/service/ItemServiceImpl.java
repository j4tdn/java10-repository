package service;

import java.sql.Date;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<ItemDto> getDayDtos(Date date) {
		return itemDao.getDayDtos(date);
	}

	@Override
	public List<String> getTop(Integer year, Integer limit) {
		return itemDao.getTop(year, limit);
	}

}
