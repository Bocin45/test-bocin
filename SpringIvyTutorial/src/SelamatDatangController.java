import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SelamatDatangController {
	
	private static final String VIEW_INDEX = "index";
	private final static Logger logger = (Logger) LoggerFactory.getLogger(SelamatDatangController.class);
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 
		model.addAttribute("message", "");
		((org.slf4j.Logger) logger).debug("[welcome]");
 
		return VIEW_INDEX;
 
	}
 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Welcome " + name);
		((org.slf4j.Logger) logger).debug("[welcomeName] name : {}", name);
		return VIEW_INDEX;
 
	}
	

}
