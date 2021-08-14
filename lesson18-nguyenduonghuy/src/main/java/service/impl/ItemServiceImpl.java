package service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.ItemDAO;
import dao.impl.ItemDAOImpl;
import persistence.Item;
import service.ItemService;

public class ItemServiceImpl implements ItemService {
	
	private ItemDAO itemDAO;
	
	public ItemServiceImpl() {
		itemDAO = new ItemDAOImpl();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDAO.getAll();
	}

	@Override
	public List<String> getQuantity(int year, int limit) {
		return itemDAO.getQuantity(year, limit)
					  .stream().map(i -> i.getName())
					  .collect(Collectors.toList());
	}

	@Override
	public List<Item> get(LocalDate date) {
		return itemDAO.get(date);
	}

}
