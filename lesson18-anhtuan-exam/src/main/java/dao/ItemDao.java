package dao;

import java.sql.Date;
import java.util.List;

import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> getDayDtos(Date date);
	List<String> getTop(Integer year, Integer limit);

}
