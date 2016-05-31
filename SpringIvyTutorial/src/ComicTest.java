package src;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import src.config.AppConfig;
import src.model.Comic;
import src.model.Customer;
import src.model.CustomerDAOImpl;
import src.service.BorrowImpl;

public class ComicTest {
	
	public static void main (String[]args) throws Exception{
		
		System.out.println("tess");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BorrowImpl borrow =  (BorrowImpl) context.getBean("borrowBean");
		Comic comic = (Comic) borrow.getComic();
		System.out.println(comic.getTitle());
		
	/*	Customer customer = new Customer();
		customer.setId("123");
		customer.setName("rizki");
		
		CustomerDAOImpl cDaoImpl = (CustomerDAOImpl) context.getBean("customerBean");
		cDaoImpl.save(customer);*/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("src/config/BeanLocation.xml");
		CustomerDAOImpl customerDAOImpl = (CustomerDAOImpl) appContext.getBean("customerDao");
		Customer customer = new Customer();
		customer.setId("5114");
		customer.setName("test");
		customerDAOImpl.save(customer);
		
		customerDAOImpl.checkConnection();
		
		
		
		
	}

}
