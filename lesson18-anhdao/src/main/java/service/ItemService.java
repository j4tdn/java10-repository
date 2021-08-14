package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDate;
import persistence.ItemSizeDto;

public interface ItemService {
	List<ItemDate> getItemDate(LocalDate date);

	List<String> getItemBestSeller(int year, int top);
	
	List<ItemSizeDto> getItemByGroup();
}