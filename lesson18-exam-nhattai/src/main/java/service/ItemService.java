package service;

import java.sql.Date;
import java.util.List;

import persistence.ItemDto;
import persistence.ListItemOfIGroupDto;

public interface ItemService {
	List<ItemDto> getItemDtos(Date orderDate); 
	List<String> getTopItem(Integer year, Integer limit);
	List<ListItemOfIGroupDto> getListItemOfIGroupDto();
}
