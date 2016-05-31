package src.model;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("customerDao")
@ComponentScan
@Service
public class CustomerDAOImpl extends CustomerHibernateDaoSupport implements CustomerDAO{

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly=false)
	public void save(Customer customer) {
		// TODO Auto-generated method stub	
		getHibernateTemplate().getSessionFactory().openSession();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(session.isConnected());
		
	    getHibernateTemplate().save(customer);
	  /*  session.save(customer);
	    session.getTransaction().commit();*/
	    getHibernateTemplate().getSessionFactory().openSession();

		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(customer);
	}
	
	public void  checkConnection(){
		getHibernateTemplate().getSessionFactory().openSession();
		System.out.println(getHibernateTemplate().getSessionFactory().openSession());
		Boolean available = null;
		Session session = getSessionFactory().openSession();
		System.out.println(getSessionFactory().getCurrentSession());
		System.out.println(session.isConnected());
	}
	
	
}
