package service;

import java.sql.Date;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;
import persistence.ItemmDto;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> get() {
		return itemDao.get();
	}

	@Override
	public List<ItemmDto> getDayDtos(Date date) {
		return itemDao.getDayDtos(date);
	}

	

}
