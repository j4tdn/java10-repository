package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtils;

public class AbtractHibernateDao {
	
	Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
		//		return HibernateUtils.getSessionFactoryJava().openSession();

	}
	Session getCurrentSession() {
		//getCurrentSession return 1 thread
		return HibernateUtils.getSessionFactory().getCurrentSession();
		//		return HibernateUtils.getSessionFactoryJava().openSession();
	}
	// return id of enity
	// id !=null >> detached state	
	// id =null transient
	Object getIdentifier(Object entity) {
	   return HibernateUtils.getSessionFactory().getPersistenceUnitUtil().getIdentifier(entity);
	}
	// use when we have result transformer
	@SuppressWarnings("unchecked")
	<E> List<E> safeList (NativeQuery<?> query){
		return (List<E>)query.getResultList();
	}
}