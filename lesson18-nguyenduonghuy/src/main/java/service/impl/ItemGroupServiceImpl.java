package service.impl;

import java.util.List;

import dao.ItemGroupDAO;
import dao.impl.ItemGroupDAOImpl;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDAO itemGroupDAO;
	
	public ItemGroupServiceImpl() {
		itemGroupDAO = new ItemGroupDAOImpl();
	}
	
	@Override
	public List<ItemGroup> getAllQuantity() {
		return itemGroupDAO.getAllQuantity();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		return itemGroupDAO.getItemGroupDtos();
	}
	
}
