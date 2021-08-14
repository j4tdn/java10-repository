package service;

import java.sql.Date;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;
import persistence.ListItemOfIGroupDto;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<ItemDto> getItemDtos(Date orderDate) {
		return itemDao.getItemDtos(orderDate);
	}

	@Override
	public List<String> getTopItem(Integer year, Integer limit) {
		return itemDao.getTopItem(year, limit);
	}

	@Override
	public List<ListItemOfIGroupDto> getListItemOfIGroupDto() {
		return itemDao.getListItemOfIGroupDto();
	}
	
	
}
