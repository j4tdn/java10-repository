package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroupDto;
import utils.HibernateUtils;

public class EntityDao {
	
	public Session openSession() {
		return HibernateUtils.getSessionFactoryXml().openSession();
	}
	
	public Session getCurrentSession() {
		return HibernateUtils.getSessionFactoryXml().getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<ItemGroupDto> safeList(NativeQuery<?> query) {
		return (List<ItemGroupDto>) query.getResultList();
	}
}
