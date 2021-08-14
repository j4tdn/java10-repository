package dao;

import java.sql.Date;
import java.util.List;

import persistence.ItemDto;
import persistence.ListItemOfIGroupDto;

public interface ItemDao {
	List<ItemDto> getItemDtos(Date orderDate);
	
	List<String> getTopItem(Integer year, Integer Limit);
	
	public List<ListItemOfIGroupDto> getListItemOfIGroupDto();
}
