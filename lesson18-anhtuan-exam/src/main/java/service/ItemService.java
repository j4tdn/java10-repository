package service;

import java.sql.Date;
import java.util.List;

import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> getDayDtos(Date date);
	List<String> getTop(Integer year, Integer limit);
}
