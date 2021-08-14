package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemTop3Dto;
import persistence.ListItemByGroudIdDto;

public interface ItemService {
	List<ItemDto> getItemBySalesDate(LocalDate salesDate);
	List<ItemTop3Dto> getItemTop3ByYear(Integer year);
	List<ListItemByGroudIdDto> getListItemByGroudIdDto();
}
