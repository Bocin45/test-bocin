package src.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import src.model.Customer;
import src.model.CustomerDAO;
import src.model.CustomerDAOImpl;
import src.service.BorrowImpl;


@Configuration
public class AppConfig {
	
	@Bean(name="borrowBean")
	public BorrowImpl borrow(){
		return new BorrowImpl();
	}
	
/*	@Bean(name="customerBean")
	public CustomerDAOImpl customer(){
		return new CustomerDAOImpl();
		
	}*/
	
	

}
