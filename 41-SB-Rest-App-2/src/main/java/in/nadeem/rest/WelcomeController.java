package in.nadeem.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeController { // http://localhost://9090/rest/welcome

	/*
	 * @GetMapping("/welcome")
	 *    
	 * public String getWelcomeMsg() {
	 * 
	 * String msg = "Welcome to Rest Api...!!!";
	 * 
	 * return msg; }
	 */

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to Rest Api";

		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
