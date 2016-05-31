package src.model;

import org.springframework.stereotype.Component;

@Component
public interface CustomerDAO {
	
	void save(Customer customer);
	void update(Customer customer);
}
