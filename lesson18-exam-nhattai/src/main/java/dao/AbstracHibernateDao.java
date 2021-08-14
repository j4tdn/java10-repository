package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtils;

public class AbstracHibernateDao {
	Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}

	Session getCurrentSession() {
		return HibernateUtils.getSessionFactory().getCurrentSession();
	}

	// Use when we have result transformer
	@SuppressWarnings("unchecked")
	<E> List<E> safeList(NativeQuery<?> query) {
		return (List<E>) query.getResultList();
	}
}
