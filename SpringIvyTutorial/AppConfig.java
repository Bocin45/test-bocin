import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean(name="borrowBean")
	public Borrow borrow(){
		return new Borrow();
	}

}
