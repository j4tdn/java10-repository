package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoAmount;

public interface ItemService {
	List<Item> getAll();
	List<ItemDto> getItemDtos(LocalDate date);
	List<ItemDtoAmount> getTopThree(int year);
}
