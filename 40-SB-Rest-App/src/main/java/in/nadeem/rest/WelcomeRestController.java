package in.nadeem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcomepage")
	public String getWelcomeMsg() {
		
		String msg = "Welcome to Ashok IT...";
		
		
		return msg;
	}
}
