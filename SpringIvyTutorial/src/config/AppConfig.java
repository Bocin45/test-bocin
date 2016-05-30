package src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import src.service.BorrowImpl;


@Configuration
public class AppConfig {
	
	@Bean(name="borrowBean")
	public BorrowImpl borrow(){
		return new BorrowImpl();
	}

}
