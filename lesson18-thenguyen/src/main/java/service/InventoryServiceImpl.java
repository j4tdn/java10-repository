package service;

import java.util.List;

import dao.HibernateInventoryDao;
import dao.InventoryDao;

import persistence.InventoryDto;
import persistence.InventoryDtoTop3;

public class InventoryServiceImpl implements InventoryService {
	private InventoryDao itemGroupDao;

	public InventoryServiceImpl() {
		itemGroupDao = new HibernateInventoryDao();
	}

	public List<InventoryDto> getDtos() {
		return itemGroupDao.getItemGroupDtos();
	}

	@Override
	public List<InventoryDtoTop3> getDtoTop3s() {
		
		return itemGroupDao.getItemGroupDtosTop3();
	}

}
