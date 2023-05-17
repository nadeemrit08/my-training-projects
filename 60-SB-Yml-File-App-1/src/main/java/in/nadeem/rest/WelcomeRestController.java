package in.nadeem.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.prop.AppProperties;

@RestController
public class WelcomeRestController {

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		Map<String, String> msgs = appProperties.getMessage();
		String msgValue = msgs.get("welcomeMsg");
		return msgValue;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		Map<String, String> msgs = appProperties.getMessage();
		String greetVal = msgs.get("greetMsg");
		return greetVal;
	}

}
