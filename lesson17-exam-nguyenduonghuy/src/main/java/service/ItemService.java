package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import persistence.ItemDto;
import persistence.ItemDtoFullInfo;

public class ItemService {
	private ItemDao itemDao;
	
	public ItemService() {
		itemDao = new ItemDao();
	}
	
	public List<ItemDto> get(LocalDate date){
		return itemDao.getItemDtoByDate(date);
	}
	
	public List<String> getTop3Item(Integer year) {
		return itemDao.getTop3Item(year);
	}
	
	public List<ItemDtoFullInfo> getFullInfo() {
		return itemDao.getFullInfo();
	}
}
