package src.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class CustomeHibernateDaoSupport extends HibernateDaoSupport{
	@Autowired
	public void anyMethodName(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

}
