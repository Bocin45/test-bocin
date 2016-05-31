package src.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public abstract class CustomerHibernateDaoSupport extends HibernateDaoSupport{
	@Autowired
	public void anyMethodName(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
		getHibernateTemplate().setCheckWriteOperations(false);
	}

}
