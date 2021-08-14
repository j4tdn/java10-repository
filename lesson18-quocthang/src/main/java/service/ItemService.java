package service;

import java.sql.Date;
import java.util.List;

import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> getDay(Date date);

}
