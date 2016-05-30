package src.model;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDAOImpl extends CustomeHibernateDaoSupport implements CustomerDAO{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(customer);
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(customer);
	}

}
