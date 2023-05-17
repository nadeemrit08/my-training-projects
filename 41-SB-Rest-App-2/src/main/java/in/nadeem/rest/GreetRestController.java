package in.nadeem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/rest1 ")
	public String getGreetMsg() {
		
		 String msg = "Good Morning....!!!";

		return msg;  
	}
	
	@GetMapping("/wish")
	public String getWishMsg() {
		String msg = "All the best...!!!";
		return msg;
	}
	
	@GetMapping("/qoute")
	public String getQuote() {
		String msg = "Do or Die";
		return msg;
	}
}
