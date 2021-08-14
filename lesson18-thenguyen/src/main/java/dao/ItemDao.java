package dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import persistence.ItemDto;
import persistence.ItemmDto;

public interface ItemDao {
	List<ItemDto> get();
	List<ItemmDto> getDayDtos(Date date);
}
