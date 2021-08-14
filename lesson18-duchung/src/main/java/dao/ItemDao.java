package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemTop3;
import persistence.ListItemByGroudIdDto;

public interface ItemDao {
	List<ItemDto> getItemBySalesDate(LocalDate salesDate);
	List<ItemTop3> getItemTop3ByYear(Integer year);
	List<ListItemByGroudIdDto> getListItemByGroudIdDto();
}
