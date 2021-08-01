package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtils;

public class EnityDao {
	Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
		//		return HibernateUtils.getSessionFactoryJava().openSession();

	}
	Session getCurrentSession() {
		//getCurrentSession return 1 thread
		return HibernateUtils.getSessionFactory().getCurrentSession();
		//		return HibernateUtils.getSessionFactoryJava().openSession();

	}
	// use when we have result transformer
	@SuppressWarnings("unchecked")
	<E> List<E> safeList (NativeQuery<?> query){
		return (List<E>)query.getResultList();
	}
}
